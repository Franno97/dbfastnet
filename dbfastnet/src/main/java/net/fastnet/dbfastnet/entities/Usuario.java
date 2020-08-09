package net.fastnet.dbfastnet.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int ID;
	
	@Column(name = "nickname")
	private String nickname;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "status")
	private String status;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "userRole", joinColumns = @JoinColumn(name = "ID"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private Set<Role> roles;
	
	public Usuario(int ID, String nickname, String nombre, String password, String email, String status) {
		this.ID = ID;
		this.nickname = nickname;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.status = status;
	}
	
	public Usuario() {

	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}

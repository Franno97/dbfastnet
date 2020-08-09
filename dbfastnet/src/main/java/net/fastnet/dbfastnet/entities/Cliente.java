package net.fastnet.dbfastnet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	//@Column(name = "recetas_nombre")
	@Id
	@Column (name="IdCliente")
	private String IdCliente;
	
	@Column (name="nombreCliente")
	private String nombreCliente;
		
	@Column (name="numTelefono")
	private String numTelefono;
		
	@Column (name="provincia")
	private String provincia;
	
	@Column (name="tipoConexion")
	private String tipoConexion;
	
	public Cliente(String idCliente, String nombreCliente, String numTelefono, String provincia, String tipoConexion) {
		this.IdCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.numTelefono = numTelefono;
		this.provincia = provincia;
		this.tipoConexion = tipoConexion;
	}
	
	public Cliente() {
	
	}

	public String getIdCliente() {
		return IdCliente;
	}
		
	public void setIDreclamo(String IDcliente) {
		this.IdCliente = IDcliente;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
		
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getNumTelefono() {
		return numTelefono;
	}
		
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	public String getProvincia() {
		return provincia;
	}
		
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getTipoConexion() {
		return tipoConexion;
	}
		
	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}
}

package net.fastnet.dbfastnet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "averia")
public class Averia {
		
	//@Column(name = "recetas_nombre")
	@Id
	@Column(name="IdAveria")
	private String IdAveria;
	
	@Column(name="descripcion")
	private String descripcion;
	
	public String getIDaveria() {
		return IdAveria;
	}
	
	public Averia(String idAveria, String descripcion) {
		this.IdAveria = idAveria;
		this.descripcion = descripcion;
	}
	
	public Averia() {
	
	}
	
	public void setIDaveria(String IDaveria) {
		this.IdAveria = IDaveria;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

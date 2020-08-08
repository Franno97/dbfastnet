package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "averia")
public class Averia {
		
	//@Column(name = "recetas_nombre")
	@Id
	private String IDaveria;
	
	private String descripcion;
	
	public String getIDaveria() {
		return IDaveria;
	}
	
	public void setIDaveria(String IDaveria) {
		this.IDaveria = IDaveria;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

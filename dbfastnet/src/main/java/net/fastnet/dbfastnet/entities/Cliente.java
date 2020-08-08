package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	//@Column(name = "recetas_nombre")
	@Id
	private String IDcliente;
		
	private String nombreCliente;
		
	private String numTelefono;
		
	private String provincia;
	
	private String tipoConexion;
	
	public String getIDcliente() {
		return IDcliente;
	}
		
	public void setIDreclamo(String IDcliente) {
		this.IDcliente = IDcliente;
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

package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reclamo")
public class Reclamo {
		
	//@Column(name = "recetas_nombre")
	@Id
	private String IDreclamo;
	
	private String canalReq;
	
	private String fecReporte;
	
	private String fecReparacion;
	
	private String tiempoReparacion;
	
	private String descripSolucion;
	
	public String getIDreclamo() {
		return IDreclamo;
	}
	
	public void setIDreclamo(String IDreclamo) {
		this.IDreclamo = IDreclamo;
	}
	
	public String getCanalReq() {
		return canalReq;
	}
	
	public void setCanalReq(String canalReq) {
		this.canalReq = canalReq;
	}
	
	public String getFecReporte() {
		return fecReporte;
	}
	
	public void setFecReporte(String fecReporte) {
		this.fecReporte = fecReporte;
	}
	
	public String getFecReparacion() {
		return fecReparacion;
	}
	
	public void setPassword(String fecReparacion) {
		this.fecReparacion = fecReparacion;
	}
	
	public String getTiempoReparacion() {
		return tiempoReparacion;
	}
	
	public void setTiempoReparacion(String tiempoReparacion) {
		this.tiempoReparacion = tiempoReparacion;
	}
	
	public String getDescripSolucion() {
		return descripSolucion;
	}
	
	public void setDescripSolucion(String descripSolucion) {
		this.descripSolucion = descripSolucion;
	}
}

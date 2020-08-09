package net.fastnet.dbfastnet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reclamo")
public class Reclamo {
		
	
	@Id
	@Column(name = "IDreclamo")
	private String IDreclamo;
	
	@Column(name = "canalReq")
	private String canalReq;
	
	@Column(name = "fecReporte")
	private String fecReporte;
	
	@Column(name = "fecReparacion")
	private String fecReparacion;
	
	@Column(name = "tiempoReparacion")
	private String tiempoReparacion;
	
	@Column(name = "descripSolucion")
	private String descripSolucion;
	
	public Reclamo(String iDreclamo, String canalReq, String fecReporte, String fecReparacion, String tiempoReparacion,
			String descripSolucion) {
		this.IDreclamo = iDreclamo;
		this.canalReq = canalReq;
		this.fecReporte = fecReporte;
		this.fecReparacion = fecReparacion;
		this.tiempoReparacion = tiempoReparacion;
		this.descripSolucion = descripSolucion;
	}
	
	public Reclamo() {
		
	}

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

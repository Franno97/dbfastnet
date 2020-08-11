package net.fastnet.dbfastnet.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "Claim")
public class Claim{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String idcustomer;
    private String idbreakdown;
    private String requestchannel;
    private Date datetimereport;
    private Date datetimerepair;
    private Time repairtime;
    private String solutiondesc;
    
	public Claim() {
	}

	public Claim(String idcustomer, String idbreakdown, String requestchannel,
			Date datetimereport, Date datetimerepair, Time repairtime, String solutiondesc) {
		this.idcustomer = idcustomer;
		this.idbreakdown = idbreakdown;
		this.requestchannel = requestchannel;
		this.datetimereport = datetimereport;
		this.datetimerepair = datetimerepair;
		this.repairtime = repairtime;
		this.solutiondesc = solutiondesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdcustomer() {
		return idcustomer;
	}

	public void setIdcustomer(String idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getIdbreakdown() {
		return idbreakdown;
	}

	public void setIdbreakdown(String idbreakdown) {
		this.idbreakdown = idbreakdown;
	}

	public String getRequestchannel() {
		return requestchannel;
	}

	public void setRequestchannel(String requestchannel) {
		this.requestchannel = requestchannel;
	}

	public Date getDatetimereport() {
		return datetimereport;
	}

	public void setDatetimereport(Date datetimereport) {
		this.datetimereport = datetimereport;
	}

	public Date getDatetimerepair() {
		return datetimerepair;
	}

	public void setDatetimerepair(Date datetimerepair) {
		this.datetimerepair = datetimerepair;
	}

	public Time getRepairtime() {
		return repairtime;
	}

	public void setRepairtime(Time repairtime) {
		this.repairtime = repairtime;
	}

	public String getSolutiondesc() {
		return solutiondesc;
	}

	public void setSolutiondesc(String solutiondesc) {
		this.solutiondesc = solutiondesc;
	}
	

	@Override
	    public String toString() {
	        return "Claim{" +
	            "id=" + id +
	            ", idcustomer='" + idcustomer +
	            ", idbreakdown='" + idbreakdown +
	            ", requestchannel='" + requestchannel + 
	            ", datetimereport='" + datetimereport + 
	            ", datetimerepair='" + datetimerepair + 
	            ", repairtime='" + repairtime +
	            ", solutiondesc='" + solutiondesc + '\'' +
	            '}';
	    }
}

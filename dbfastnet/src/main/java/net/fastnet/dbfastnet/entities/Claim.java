package net.fastnet.dbfastnet.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "Claim")
public class Claim{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name="Customer", referencedColumnName = "idcustomer")
    private Customer idcustomer;
    
    @ManyToOne
    @JoinColumn(name="Breakdown", referencedColumnName = "idbreakdown")
    private Breakdown idbreakdown;
    
    private String requestchannel;
    private String datetimereport;
    private String datetimerepair;
    private String repairtime;
    private String solutiondesc;
    
	public Claim() {
	}

	public Claim(Customer idcustomer, Breakdown idbreakdown, String requestchannel,
			String datetimereport, String datetimerepair, String repairtime, String solutiondesc) {
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

	public Customer getIdcustomer() {
		return idcustomer;
	}

	public void setIdcustomer(Customer idcustomer) {
		this.idcustomer = idcustomer;
	}

	public Breakdown getIdbreakdown() {
		return idbreakdown;
	}

	public void setIdbreakdown(Breakdown idbreakdown) {
		this.idbreakdown = idbreakdown;
	}

	public String getRequestchannel() {
		return requestchannel;
	}

	public void setRequestchannel(String requestchannel) {
		this.requestchannel = requestchannel;
	}

	public String getDatetimereport() {
		return datetimereport;
	}

	public void setDatetimereport(String datetimereport) {
		this.datetimereport = datetimereport;
	}

	public String getDatetimerepair() {
		return datetimerepair;
	}

	public void setDatetimerepair(String datetimerepair) {
		this.datetimerepair = datetimerepair;
	}

	public String getRepairtime() {
		return repairtime;
	}

	public void setRepairtime(String repairtime) {
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

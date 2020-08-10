package net.fastnet.dbfastnet.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Claim{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String IdCustomer;
    private String IdBreakdown;
    private String requestChannel;
    private Date dateTimeReport;
    private Date dateTimeRepair;
    private Time repairTime;
    private String solutionDesc;
    
	public Claim() {
	}

	public Claim(Long id, String idCustomer, String idBreakdown, String requestChannel,
			Date dateTimeReport, Date dateTimeRepair, Time repairTime, String solutionDesc) {
		this.id = id;
		this.IdCustomer = idCustomer;
		this.IdBreakdown = idBreakdown;
		this.requestChannel = requestChannel;
		this.dateTimeReport = dateTimeReport;
		this.dateTimeRepair = dateTimeRepair;
		this.repairTime = repairTime;
		this.solutionDesc = solutionDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdCustomer() {
		return IdCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		IdCustomer = idCustomer;
	}

	public String getIdBreakdown() {
		return IdBreakdown;
	}

	public void setIdBreakdown(String idBreakdown) {
		IdBreakdown = idBreakdown;
	}

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

	public Date getDateTimeReport() {
		return dateTimeReport;
	}

	public void setDateTimeReport(Date dateTimeReport) {
		this.dateTimeReport = dateTimeReport;
	}

	public Date getDateTimeRepair() {
		return dateTimeRepair;
	}

	public void setDateTimeRepair(Date dateTimeRepair) {
		this.dateTimeRepair = dateTimeRepair;
	}

	public Time getRepairTime() {
		return repairTime;
	}

	public void setRepairTime(Time repairTime) {
		this.repairTime = repairTime;
	}

	public String getSolutionDesc() {
		return solutionDesc;
	}

	public void setSolutionDesc(String solutionDesc) {
		this.solutionDesc = solutionDesc;
	}
	

	@Override
	    public String toString() {
	        return "Claim{" +
	            "id=" + id +
	            ", IdCustomer='" + IdCustomer +
	            ", IdBreakdown='" + IdBreakdown +
	            ", requestChannel='" + requestChannel + 
	            ", dateTimeReport='" + dateTimeReport + 
	            ", dateTimeRepair='" + dateTimeRepair + 
	            ", repairTime='" + repairTime +
	            ", solutionDesc='" + solutionDesc + '\'' +
	            '}';
	    }
}

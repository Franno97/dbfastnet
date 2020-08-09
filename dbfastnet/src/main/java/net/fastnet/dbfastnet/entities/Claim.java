package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Claim{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String IdReclamo;
    private String requestChannel;
    private String dateTimeReport;
    private String dateTimeRepair;
    private String repairTime;
    private String solutionDesc;
    
	public Claim() {
	}

	public Claim(Long id, String iDreclamo, String requestChannel, String dateTimeReport, String dateTimeRepair,
			String repairTime, String solutionDesc) {
		this.id = id;
		IdReclamo = iDreclamo;
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

	public String getIDreclamo() {
		return IdReclamo;
	}

	public void setIDreclamo(String iDreclamo) {
		IdReclamo = iDreclamo;
	}

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

	public String getDateTimeReport() {
		return dateTimeReport;
	}

	public void setDateTimeReport(String dateTimeReport) {
		this.dateTimeReport = dateTimeReport;
	}

	public String getDateTimeRepair() {
		return dateTimeRepair;
	}

	public void setDateTimeRepair(String dateTimeRepair) {
		this.dateTimeRepair = dateTimeRepair;
	}

	public String getRepairTime() {
		return repairTime;
	}

	public void setRepairTime(String repairTime) {
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
	        return "Breakdown{" +
	            "id=" + id +
	            ", IdReclamo='" + IdReclamo + 
	            ", requestChannel='" + requestChannel + 
	            ", dateTimeReport='" + dateTimeReport + 
	            ", dateTimeRepair='" + dateTimeRepair + 
	            ", repairTime='" + repairTime +
	            ", solutionDesc='" + solutionDesc + '\'' +
	            '}';
	    }
}

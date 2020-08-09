package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Breakdown {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String IdBreakdown;
    private String description;
    
    public Breakdown() {
	}

    public Breakdown(Long id, String IdBreakdown, String description) {
		this.id = id;
		this.IdBreakdown = IdBreakdown;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIDbreakdown() {
		return IdBreakdown;
	}

	public void setIDbreakdow(String IDbreakdown) {
		this.IdBreakdown = IDbreakdown;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	   @Override
	    public String toString() {
	        return "Breakdown{" +
	            "id=" + id +
	            ", IdBreakdown='" + IdBreakdown + 
	            ", description='" + description + '\'' +
	            '}';
	    }
}


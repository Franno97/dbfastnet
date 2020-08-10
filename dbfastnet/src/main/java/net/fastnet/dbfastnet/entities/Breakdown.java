package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Breakdown")
public class Breakdown {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String IdBreakdown;
    private String description;
    
    public Breakdown() {
	}

    public Breakdown(String IdBreakdown, String description) {
		this.IdBreakdown = IdBreakdown;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdBreakdown() {
		return IdBreakdown;
	}

	public void setIdBreakdow(String IdBreakdown) {
		this.IdBreakdown = IdBreakdown;
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


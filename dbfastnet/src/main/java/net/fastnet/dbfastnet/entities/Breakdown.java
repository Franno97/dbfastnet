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

    private String idbreakdown;
    private String description;
    
    public Breakdown() {
	}

    public Breakdown(String idbreakdown, String description) {
		this.idbreakdown = idbreakdown;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdbreakdown() {
		return idbreakdown;
	}

	public void setIdbreakdow(String idbreakdown) {
		this.idbreakdown = idbreakdown;
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
	             ", description='" + description +
	            ", idbreakdown='" + idbreakdown + '\'' +
	            '}';
	    }
}


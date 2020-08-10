package net.fastnet.dbfastnet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String IdCustomer;
    private String name;
    private String phone;
    private String province;
    private String connectionType;
    
   	public Customer() {
	}

	public Customer(Long id, String iDcustomer, String name, String phone, String province, String connectionType) {
		this.id = id;
		this.IdCustomer = iDcustomer;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.connectionType = connectionType;
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

	public void setIdCustomer(String IDcustomer) {
		this.IdCustomer = IDcustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	@Override
	    public String toString() {
	        return "Customer{" +
	            "id=" + id +
	            ", IdCustomer='" + IdCustomer +
	            ", name='" + name + 
	            ", phone='" + phone + 
	            ", province='" + province + 
	            ", connectionType='" + connectionType + '\'' +
	            '}';
	    }
}


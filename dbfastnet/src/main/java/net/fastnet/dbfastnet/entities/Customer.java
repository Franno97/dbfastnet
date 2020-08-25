package net.fastnet.dbfastnet.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table (name = "Customer")
public class Customer{

    @Id
    private String idcustomer;
    private String name;
    private String phone;
    private String province;
    private String connectiontype;
    
   	public Customer() {
	}

	public Customer(String idcustomer, String name, String phone, String province, String connectiontype) {
		this.idcustomer = idcustomer;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.connectiontype = connectiontype;
	}
	
	public String getIdcustomer() {
		return idcustomer;
	}

	public void setIdcustomer(String idcustomer) {
		this.idcustomer = idcustomer;
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

	public String getConnectiontype() {
		return connectiontype;
	}

	public void setConnectiontype(String connectiontype) {
		this.connectiontype = connectiontype;
	}

	@Override
	    public String toString() {
	        return "Customer{" +
	            ", idcustomer='" + idcustomer +
	            ", name='" + name + 
	            ", phone='" + phone + 
	            ", province='" + province + 
	            ", connectiontype='" + connectiontype + '\'' +
	            '}';
	    }
}


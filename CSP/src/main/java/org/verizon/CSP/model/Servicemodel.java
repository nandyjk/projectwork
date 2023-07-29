package org.verizon.CSP.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Servicemodel {
	@Id
	private int service_id;
	
	@ManyToOne 
    @JoinColumn(name = "plan_id") 
	private  Catalogmodel catalogmodel;
	
	private String Provision;
	private String Test_qos;
	private String Actitvity;
	
	public Servicemodel() {
		// TODO Auto-generated constructor stub
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getProvision() {
		return Provision;
	}

	public void setProvision(String provision) {
		Provision = provision;
	}

	public String getTest_qos() {
		return Test_qos;
	}

	public void setTest_qos(String test_qos) {
		Test_qos = test_qos;
	}

	public Catalogmodel getCatalogmodel() {
		return catalogmodel;
	}

	public void setCatalogmodel(Catalogmodel catalogmodel) {
		this.catalogmodel = catalogmodel;
	}

	public String getActitvity() {
		return Actitvity;
	}

	public void setActitvity(String actitvity) {
		Actitvity = actitvity;
	}	
}
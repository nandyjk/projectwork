package org.verizon.CSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customermodel {
	
	@Id
	private int cust_id;
	private String cust_name;
	@ManyToOne // Many books can be written by one author
    @JoinColumn(name = "order_id") 
	private  Ordermodel ordermodel;

	public Customermodel() {
		
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Ordermodel getOrdermodel() {
		return ordermodel;
	}

	public void setOrdermodel(Ordermodel ordermodel) {
		this.ordermodel = ordermodel;
	}	

}
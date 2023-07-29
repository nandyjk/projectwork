package org.verizon.CSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enterprisemodel {
 
	@Id
	private int ec_id;
	private String ec_name;
	@ManyToOne // Many books can be written by one author
    @JoinColumn(name = "order_id") 
	private  Ordermodel ordermodel;
	
	public Enterprisemodel() {
		// TODO Auto-generated constructor stub
	}

	public int getEc_id() {
		return ec_id;
	}

	public void setEc_id(int ec_id) {
		this.ec_id = ec_id;
	}

	public String getEc_name() {
		return ec_name;
	}

	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}

	public Ordermodel getOrdermodel() {
		return ordermodel;
	}

	public void setOrdermodel(Ordermodel ordermodel) {
		this.ordermodel = ordermodel;
	}
	
	
}
package org.verizon.CSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ordermodel {
	
	
	@ManyToOne // Many orders can be taken for one plan
    @JoinColumn(name = "plan_id") // Name of the foreign key column in the order table
	private  Catalogmodel catalogmodel;
	
	
	
	@Id
	private int order_id;
	public Ordermodel() {
	}
	public Catalogmodel getCatalogmodel() {
		return catalogmodel;
	}
	public void setCatalogmodel(Catalogmodel catalogmodel) {
		this.catalogmodel = catalogmodel;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	

	
}

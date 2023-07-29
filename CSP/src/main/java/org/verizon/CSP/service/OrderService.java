package org.verizon.CSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP.model.Ordermodel;
import org.verizon.CSP.repo.Orderrepo;

@Service
public class OrderService {

	private final Orderrepo orderrepo;
	
	@Autowired
	public OrderService(Orderrepo orderrepo) {

		this.orderrepo = orderrepo;
	}
	
	public List<Ordermodel> getAllOrdermodel(){
		return orderrepo.findAll();
	}
	
	public Ordermodel createOrdermodel(Ordermodel ordermodel) {
		return orderrepo.save(ordermodel);
	}
	
	public Ordermodel getOrdermodelById (Integer ord_id) {
		return orderrepo.findById(ord_id).orElse((null));
	}
	
	
	
	public Ordermodel updateOrdermodel(Integer id,Ordermodel ordermodel) {
		Ordermodel existingOrdermodel = orderrepo.findById(id).orElse(null);
		if (existingOrdermodel != null) {
			existingOrdermodel.setOrder_id(ordermodel.getOrder_id());
			existingOrdermodel.setCatalogmodel(ordermodel.getCatalogmodel());
		
			return orderrepo.save(existingOrdermodel);
			
		}
		return null;
	}

}

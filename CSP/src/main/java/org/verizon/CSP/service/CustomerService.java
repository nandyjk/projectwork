package org.verizon.CSP.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP.model.Customermodel;
import org.verizon.CSP.repo.Customerrepo;


@Service
public class CustomerService {
	
private final Customerrepo custrepo;
	
	@Autowired
	public CustomerService(Customerrepo custrepo) {
		// TODO Auto-generated constructor stub
		this.custrepo = custrepo;
	}
	
	public List<Customermodel> getAllCustomermodel(){
		return custrepo.findAll();
	}
	
	public Customermodel createCustomermodel(Customermodel customermodel) {
		
		return custrepo.save(customermodel);
	}
	
	public Customermodel getCustomermodelById (Integer cust_id) {
		return custrepo.findById(cust_id).orElse((null));
	}
	
	
	public Customermodel updateCustomermodel(Integer id,Customermodel customermodel) {
		Customermodel existingCustomermodel = custrepo.findById(id).orElse(null);
		if (existingCustomermodel != null) {
			existingCustomermodel.setCust_id(customermodel.getCust_id());
			existingCustomermodel.setCust_name(customermodel.getCust_name());
			existingCustomermodel.setOrdermodel(customermodel.getOrdermodel());
		
			return custrepo.save(existingCustomermodel);
			
		}
		return null;
	}
	


}

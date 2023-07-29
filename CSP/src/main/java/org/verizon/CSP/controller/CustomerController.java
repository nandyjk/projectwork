package org.verizon.CSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CSP.model.Customermodel;
import org.verizon.CSP.service.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	private CustomerService custservice;
	
	@Autowired
	public CustomerController(CustomerService custservice) {
		super();
		this.custservice = custservice;
	}
	
	@RequestMapping("/allcustomer")
	public List<Customermodel> getAllCustomermodel(){
		return custservice.getAllCustomermodel();
		
	}
	
	@PostMapping("/insercustomer")
	public Customermodel createCustomermodel(@RequestBody Customermodel custmodel)
	{
		return custservice.createCustomermodel(custmodel);

}
	@GetMapping("/{id}")
	public Customermodel getCustomermodelById(@PathVariable Integer id)
	{
		return custservice.getCustomermodelById(id);

}
	
	
	@PostMapping("/{id}")
	public Customermodel updateCustomermodel(@PathVariable Integer id, @RequestBody Customermodel custmodel)
	{
		return custservice.updateCustomermodel(id,custmodel);
	}
}
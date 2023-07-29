package org.verizon.CSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CSP.model.Enterprisemodel;
import org.verizon.CSP.service.EnterpriseService;

@RestController
@RequestMapping("/api/Enterpricecustomer")
public class EnterpriseController {
	
	private EnterpriseService entpriseservice;
	
	@Autowired
	public EnterpriseController(EnterpriseService entpriseservice) {
		super();
		this.entpriseservice = entpriseservice;
	}
	
	@RequestMapping("/allepcust")
	public List<Enterprisemodel> getAllEnterpriseCustomermodel(){
		return entpriseservice.getAllEnterpriseCustomermodel();
		
	}
	
	@PostMapping("/inserepcust")
	public Enterprisemodel createEnterpriseCustomermodel(@RequestBody Enterprisemodel entprisemodel)
	{
		return entpriseservice.createEnterpriseCustomermodel(entprisemodel);

}
	
	
	@GetMapping("/{id}")
	public Enterprisemodel getEnterpriseCustomermodelById(@PathVariable Integer id)
	{
		return entpriseservice.getEnterpriseCustomermodelById(id);

}

	@PostMapping("/{id}")
	public Enterprisemodel updateEnterpriseCustomermodel(@PathVariable Integer id, @RequestBody Enterprisemodel entprisemodel)
	{
		return entpriseservice.updateEnterpriseCustomermodel(id,entprisemodel);
	}
	
	
}
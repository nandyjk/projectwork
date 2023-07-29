package org.verizon.CSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CSP.model.Servicemodel;
import org.verizon.CSP.service.Servicee;


@RestController
@RequestMapping("/api/service")
public class ServiceController {
	
private Servicee service;
	
	@Autowired
	public ServiceController(Servicee service) {
		
		this.service = service;
	}
	
	@RequestMapping("/allservice")
	public List<Servicemodel> getAllServicemodel(){
		return service.getAllServicemodel();
		
		
	}
	
	@PostMapping("/insertservice")
	public Servicemodel createServicemodel(@RequestBody Servicemodel servicemodel)
	{
		return service.createServicemodel(servicemodel);

}
	

	@GetMapping("/{id}")
	public Servicemodel getServicemodelById(@PathVariable Integer id)
	{
		return service.getServicemodelById(id);

}

	
	@PostMapping("/{id}")
	public Servicemodel updateServicemodel(@PathVariable Integer id, @RequestBody Servicemodel servicemodel)
	{
		return service.updateServicemodel(id,servicemodel);
	}
	


}
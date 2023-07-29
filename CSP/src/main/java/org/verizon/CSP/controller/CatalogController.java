package org.verizon.CSP.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.verizon.CSP.model.Catalogmodel;
import org.verizon.CSP.service.CatalogService;



@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

	private CatalogService catservice;
	
	
	@Autowired
	public CatalogController(CatalogService catservice) {
		super();
		this.catservice = catservice;
	}
	
	@RequestMapping("/allcatalog")
	public List<Catalogmodel> getAllCatalogmodel(){
		return catservice.getAllCatalogmodel();
		
	}
	
	@PostMapping("/insertcatalog")
	public Catalogmodel createCatalogmodel(@RequestBody Catalogmodel catmodel)
	{
		return catservice.createCatalogmodel(catmodel);

}
	
	@GetMapping("/{id}")
	public Catalogmodel getCatalogmodelById(@PathVariable Integer id)
	{
		return catservice.getCatalogmodelById(id);

}
	
	
	
	@PostMapping("/{id}")
	public Catalogmodel updateCatalogmodel(@PathVariable Integer id, @RequestBody Catalogmodel catmodel)
	{
		return catservice.updateCatalogmodel(id,catmodel);
	}
	
	@DeleteMapping("/{id}")
	public void deletePlan(@PathVariable Integer id)
	{
		catservice.deleteCatalogmodel(id);
		
	}
	
}
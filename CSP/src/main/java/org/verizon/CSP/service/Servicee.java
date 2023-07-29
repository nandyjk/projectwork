package org.verizon.CSP.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP.model.Servicemodel;
import org.verizon.CSP.repo.Servicerepo;

@Service
public class Servicee {

	private final Servicerepo servrepo;
	
	@Autowired
	public Servicee(Servicerepo servrepo) {
		// TODO Auto-generated constructor stub
		this.servrepo = servrepo;
	}
	
	public List<Servicemodel> getAllServicemodel(){
		return servrepo.findAll();
	}
	
	public Servicemodel createServicemodel(Servicemodel servicemodel) {
		
		return servrepo.save(servicemodel);
		
	}
	
	public Servicemodel getServicemodelById (Integer service_id) {
		return servrepo.findById(service_id).orElse((null));
	}
	public Servicemodel updateServicemodel(Integer id,Servicemodel servicemodel) {
		Servicemodel existingServicemodel = servrepo.findById(id).orElse(null);
		if (existingServicemodel != null) {
			existingServicemodel.setService_id(servicemodel.getService_id());
			existingServicemodel.setProvision(servicemodel.getProvision());
			existingServicemodel.setTest_qos(servicemodel.getTest_qos());
			existingServicemodel.setActitvity(servicemodel.getActitvity());
			existingServicemodel.setCatalogmodel(servicemodel.getCatalogmodel());
		
			return servrepo.save(existingServicemodel);
			
		}
		return null;
	}



}
package org.verizon.CSP.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP.model.Enterprisemodel;
import org.verizon.CSP.repo.EnterpriseRepo;


@Service
public class EnterpriseService {

	private final EnterpriseRepo entprisegrepo;
	
	@Autowired
	public EnterpriseService(EnterpriseRepo entprisegrepo) {

		this.entprisegrepo = entprisegrepo;
	}
	
		
	public List<Enterprisemodel> getAllEnterpriseCustomermodel(){
		return entprisegrepo.findAll();
	}
	
	public Enterprisemodel createEnterpriseCustomermodel(Enterprisemodel entprisemodel) {
		return entprisegrepo.save(entprisemodel);
	}
	
	public Enterprisemodel getEnterpriseCustomermodelById (Integer ecust_id) {
		return entprisegrepo.findById(ecust_id).orElse((null));
	}
	
	public Enterprisemodel updateEnterpriseCustomermodel(Integer id,Enterprisemodel entprisemodel) {
		Enterprisemodel existingEnterpriseCustomermodel = entprisegrepo.findById(id).orElse(null);
		if (existingEnterpriseCustomermodel != null) {
			existingEnterpriseCustomermodel.setEc_id(entprisemodel.getEc_id());
			existingEnterpriseCustomermodel.setEc_name(entprisemodel.getEc_name());
			existingEnterpriseCustomermodel.setOrdermodel(entprisemodel.getOrdermodel());
		
			return entprisegrepo.save(existingEnterpriseCustomermodel);
			
		}
		return null;
	}
	
}

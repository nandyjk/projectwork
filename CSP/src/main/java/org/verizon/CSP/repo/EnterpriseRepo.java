package org.verizon.CSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CSP.model.Enterprisemodel;

@Repository
public interface EnterpriseRepo extends JpaRepository<Enterprisemodel, Integer> {

}

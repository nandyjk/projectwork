package org.verizon.CSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CSP.model.Customermodel;

@Repository
public interface Customerrepo extends JpaRepository<Customermodel, Integer>{

}

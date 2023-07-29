package org.verizon.CSP.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import org.verizon.CSP.model.Ordermodel;

@Repository
public interface Orderrepo extends JpaRepository<Ordermodel, Integer>{

}
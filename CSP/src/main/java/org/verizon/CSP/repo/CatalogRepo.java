package org.verizon.CSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.verizon.CSP.model.Catalogmodel;



@Repository
public interface CatalogRepo extends JpaRepository<Catalogmodel, Integer> {

}

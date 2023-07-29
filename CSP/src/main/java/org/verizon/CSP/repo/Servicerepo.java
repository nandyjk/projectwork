package org.verizon.CSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CSP.model.Servicemodel;


@Repository
public interface Servicerepo extends JpaRepository<Servicemodel, Integer> {

}

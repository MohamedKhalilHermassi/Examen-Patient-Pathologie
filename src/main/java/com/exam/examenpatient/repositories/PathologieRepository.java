package com.exam.examenpatient.repositories;

import com.exam.examenpatient.entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie,Long> {
Pathologie findByCodePath(String codePath);
Pathologie findByLibelle(String libelle);
}

package com.exam.examenpatient.repositories;

import com.exam.examenpatient.entities.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ActeRepository extends JpaRepository<Acte,Long> {
    Acte findByCodeActe(String code);
}

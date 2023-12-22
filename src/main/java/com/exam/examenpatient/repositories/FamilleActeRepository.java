package com.exam.examenpatient.repositories;

import com.exam.examenpatient.entities.FamilleActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FamilleActeRepository extends JpaRepository<FamilleActe,Long> {
}

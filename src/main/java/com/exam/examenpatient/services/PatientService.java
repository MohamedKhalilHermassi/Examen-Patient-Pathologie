package com.exam.examenpatient.services;

import com.exam.examenpatient.entities.Pathologie;
import com.exam.examenpatient.entities.Patient;
import com.exam.examenpatient.repositories.PathologieRepository;
import com.exam.examenpatient.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PatientService {
        private PatientRepository patientRepository;
        private PathologieRepository pathologieRepository;
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath)
    {
        Pathologie pathologie = pathologieRepository.findByCodePath(codePath);
        // Affecter pathologie à un patient
        List<Pathologie> pathologies = new ArrayList<>();
        pathologies.add(pathologie);
        p.setPathologies(pathologies);

        return patientRepository.save(p);

    }
}

package com.exam.examenpatient.services;

import com.exam.examenpatient.entities.Acte;
import com.exam.examenpatient.entities.Pathologie;
import com.exam.examenpatient.repositories.ActeRepository;
import com.exam.examenpatient.repositories.PathologieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class ActeService
{
    private ActeRepository acteRepository;
    private PathologieRepository pathologieRepository;
    public void affecterActeAPathologie(String codeActe , String codePathologie){

        Acte acte = acteRepository.findByCodeActe(codeActe);
        Pathologie pathologie = pathologieRepository.findByCodePath(codePathologie);
        if (!pathologie.getArchive()) {


            if (acte.getPathologies() == null && pathologie.getActes() == null) {
                List<Pathologie> pathologies = new ArrayList<>();
                pathologies.add(pathologie);
                acte.setPathologies(pathologies);

                List<Acte> actes = new ArrayList<>();
                actes.add(acte);
                pathologie.setActes(actes);

                acteRepository.save(acte);
                pathologieRepository.save(pathologie);
            } else {
                List<Pathologie> pathologies = acte.getPathologies();
                pathologies.add(pathologie);
                acte.setPathologies(pathologies);

                List<Acte> actes = pathologie.getActes();
                actes.add(acte);
                pathologie.setActes(actes);

                acteRepository.save(acte);
                pathologieRepository.save(pathologie);
            }
        }

    }

}

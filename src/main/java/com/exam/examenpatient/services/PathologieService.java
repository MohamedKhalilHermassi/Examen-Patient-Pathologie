package com.exam.examenpatient.services;

import com.exam.examenpatient.entities.Acte;
import com.exam.examenpatient.entities.Pathologie;
import com.exam.examenpatient.repositories.PathologieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PathologieService {
    private PathologieRepository pathologieRepository;
    //ADD
    public Pathologie add(Pathologie pathologie)
    {
        pathologie.setArchive(false);
        return pathologieRepository.save(pathologie);
    }

    public float calculerFacture(String identifiant)
    {
    Pathologie pathologie = pathologieRepository.findByCodePath(identifiant);
    if (pathologie == null)
    {
        pathologie = pathologieRepository.findByLibelle(identifiant);
    }

        List<Acte> actes = pathologie.getActes();
        Float somme= (float) 0;
        for (Acte acte : actes) {
            somme += (acte.getPrixUnitaireActe()) * (acte.getCotatonActe());
        }
        return somme;
    }

    @Scheduled(fixedDelay = 10000)
    public void calculerNombreActesParPathologie()
    {
        List<Pathologie> pathologies = pathologieRepository.findAll();
        pathologies.stream().forEach(
                pathologie -> {
                    log.info("pathologies "+ pathologie.getLibelle() + "a : " + pathologie.getActes().size()+ " actes");
                }
        );

    }
}

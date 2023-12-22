package com.exam.examenpatient.services;

import com.exam.examenpatient.entities.Acte;
import com.exam.examenpatient.entities.FamilleActe;
import com.exam.examenpatient.repositories.ActeRepository;
import com.exam.examenpatient.repositories.FamilleActeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class FamilleActeService {
    private FamilleActeRepository familleActeRepository;
    private ActeRepository acteRepository;

    public FamilleActe add(FamilleActe familleActe)
    {

        FamilleActe f = familleActeRepository.save(familleActe);
        List<Acte> actes = f.getActes();
        actes.stream().forEach(acte -> {
            acte.setFamilleActe(f);
            acteRepository.save(acte);
        });
        return f;
    }
}

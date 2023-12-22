package com.exam.examenpatient.controllers;

import com.exam.examenpatient.entities.FamilleActe;
import com.exam.examenpatient.services.FamilleActeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("famille-acte")
public class FamilleActeController {

    private FamilleActeService familleActeService;

    @PostMapping("add")
    public FamilleActe ajouter(@RequestBody FamilleActe familleActe)
    {
        return familleActeService.add(familleActe);
    }
}

package com.exam.examenpatient.controllers;

import com.exam.examenpatient.entities.Pathologie;
import com.exam.examenpatient.services.PathologieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("pathologie")

public class PathologieController {

    private PathologieService pathologieService;

    @PostMapping("add")
    public Pathologie ajotuer(@RequestBody Pathologie pathologie)
    {
        return pathologieService.add(pathologie);
    }

    @GetMapping("facture/{identifiant}")
    public Float getFacture(@PathVariable("identifiant") String identifiant)
    {
        return pathologieService.calculerFacture(identifiant);
    }

}

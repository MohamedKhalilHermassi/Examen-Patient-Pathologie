package com.exam.examenpatient.controllers;


import com.exam.examenpatient.services.ActeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("acte")
public class ActeController
{
    private ActeService acteService;

    @PutMapping("affect/{codeActe}/{codePathologie}")
    public void affecterActeAPathologie(@PathVariable("codeActe") String codeActe,@PathVariable("codePathologie") String codePathologie)
    {
         acteService.affecterActeAPathologie(codeActe,codePathologie);
    }
}

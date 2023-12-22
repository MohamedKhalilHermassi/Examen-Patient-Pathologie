package com.exam.examenpatient.controllers;

import com.exam.examenpatient.entities.Pathologie;
import com.exam.examenpatient.entities.Patient;
import com.exam.examenpatient.services.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("patient")
public class PatientController {
    private PatientService patientService;

    @PostMapping("add/{codePath}")
    public Patient addPatientandAssignPathologie(@RequestBody Patient patient, @PathVariable("codePath") String codePath)
    {
        return patientService.ajouterPatientEtAffecterAPathologie(patient,codePath);
    }


}

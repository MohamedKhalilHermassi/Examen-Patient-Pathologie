package com.exam.examenpatient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamenPatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenPatientApplication.class, args);
    }

}

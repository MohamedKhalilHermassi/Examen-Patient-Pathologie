package com.exam.examenpatient.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private String identifiantPieceIdentite;
    @Temporal(TemporalType.DATE)
    private Date dateEmission;
    private String nomP;
    private String prenomP;
    @Enumerated(EnumType.STRING)
    private TypePieceIdentite typePieceIdentite;
    @ManyToMany
    List<Pathologie> pathologies;

}

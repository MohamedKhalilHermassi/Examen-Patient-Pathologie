package com.exam.examenpatient.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;
    private String codeActe;
    private Integer cotatonActe;
    private Float prixUnitaireActe;
    private String designationActe;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    FamilleActe familleActe;
    @ManyToMany
    List<Pathologie> pathologies;

}

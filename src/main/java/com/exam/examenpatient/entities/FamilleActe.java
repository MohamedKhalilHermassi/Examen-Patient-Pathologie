package com.exam.examenpatient.entities;

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
public class FamilleActe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFa;
    private String codeFa;
    private String libelle;
    private String description;
    @OneToMany(mappedBy = "familleActe",cascade = CascadeType.ALL)
    List<Acte> actes;


}

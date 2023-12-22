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

public class Pathologie  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPath;
    private String codePath;
    private String libelle;
    private String description;
    private Boolean archive;
    @ManyToMany(mappedBy = "pathologies",fetch = FetchType.EAGER)
    List<Acte> actes;
}

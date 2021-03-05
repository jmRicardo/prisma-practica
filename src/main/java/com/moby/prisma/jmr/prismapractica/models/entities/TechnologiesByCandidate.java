package com.moby.prisma.jmr.prismapractica.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "technologies_by_candidate")
public class TechnologiesByCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_technologies_by_candidate")
    private long id;

    private long idTechnology;


}

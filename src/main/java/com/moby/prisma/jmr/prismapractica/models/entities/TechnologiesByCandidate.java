package com.moby.prisma.jmr.prismapractica.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "technologies_by_candidate")
public class TechnologiesByCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_technologies_by_candidate")
    private long id;


    private long idCandidate;

    private long idTechnology;


}

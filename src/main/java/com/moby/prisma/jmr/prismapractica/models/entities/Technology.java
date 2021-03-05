package com.moby.prisma.jmr.prismapractica.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "technologies")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_technology")
    private long id;

    private String name;

    private String version;
}

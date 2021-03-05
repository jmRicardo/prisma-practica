package com.moby.prisma.jmr.prismapractica.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "first_name")
    private String lastName;

    private String type;

    private String document;

    private Date dateOfBirth;


}

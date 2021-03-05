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
    @Column(name = "id_candidate")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    //@Enumerated(EnumType.STRING)
    private String type;

    private String document;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;


}

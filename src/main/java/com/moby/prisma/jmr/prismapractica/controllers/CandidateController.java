package com.moby.prisma.jmr.prismapractica.controllers;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.services.CandidateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping()
    public List<Candidate> getAll()
    {
        return candidateService.getAll();
    }


}

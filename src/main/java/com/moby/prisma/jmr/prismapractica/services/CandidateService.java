package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.repositories.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> getAll()
    {
        return candidateRepository.findAll();
    }
}

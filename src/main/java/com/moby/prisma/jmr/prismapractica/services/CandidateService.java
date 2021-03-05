package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.repositories.CandidateRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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

    public void add(Candidate candidate)
    {
        candidateRepository.save(candidate);
    }

    public Candidate getById(long id) {
        return candidateRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void update(Candidate candidate)
    {
        candidateRepository.save(candidateRepository.findById(candidate.getId()).orElseThrow(EntityNotFoundException::new));
    }

    public void delete(long id)
    {
        candidateRepository.deleteById(id);
    }
}

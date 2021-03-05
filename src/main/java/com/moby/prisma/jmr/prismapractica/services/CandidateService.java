package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.repositories.CandidateRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

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
        Optional<Candidate> byId = candidateRepository.findById(id);
        if (byId.isPresent())
            return byId.orElseThrow();
        throw new EntityNotFoundException("el candidato no se encuentra en la BD");
    }

    public void update(Candidate candidate,long id)
    {
        Optional<Candidate> byId = candidateRepository.findById(id);
        if (byId.isPresent())
        {
            candidate.setId(id);
            candidateRepository.save(candidate);
        }
        else
        {
            throw new EntityNotFoundException("el candidato a editar no existe!");
        }
    }

    public void delete(long id)
    {
        candidateRepository.deleteById(id);
    }
}

package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.TechnologiesByCandidate;
import com.moby.prisma.jmr.prismapractica.repositories.TechByCandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechByCandService {

    private final TechByCandRepository techByCandRepository;

    public TechByCandService(TechByCandRepository techByCandRepository) {
        this.techByCandRepository = techByCandRepository;
    }

    public List<TechnologiesByCandidate> getAll()
    {
        return techByCandRepository.findAll();
    }

    public List<TechnologiesByCandidate> getTechnologiesByCandidateAndAndTechnology_NameIsLike(long id, String name) {
        return techByCandRepository.getTechnologiesByCandidate_IdAndTechnology_Name(id,name);
    }

    public List<TechnologiesByCandidate> getTechnologiesByCandidate(long id) {
        return techByCandRepository.getTechnologiesByCandidate_Id(id);
    }
}

package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Technology;
import com.moby.prisma.jmr.prismapractica.repositories.TechnologyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    private final TechnologyRepository technologyRepository;

    public TechnologyService(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public List<Technology> getAll()
    {
        return technologyRepository.findAll();
    }


}

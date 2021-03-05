package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Technology;
import com.moby.prisma.jmr.prismapractica.repositories.TechnologyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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


    public Technology getById(long id) {
        return technologyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void add(Technology technology) {
        technologyRepository.save(technology);
    }

    public void update(Technology technology) {
        technologyRepository.save(technologyRepository.findById(technology.getId()).orElseThrow(EntityNotFoundException::new));
    }

    public void delete(long id) {

    }
}

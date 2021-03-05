package com.moby.prisma.jmr.prismapractica.controllers;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.models.entities.TechnologiesByCandidate;
import com.moby.prisma.jmr.prismapractica.services.TechByCandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exp")
public class TechByCandController
{
    private final TechByCandService techByCandService;

    public TechByCandController(TechByCandService techByCandService) {
        this.techByCandService = techByCandService;
    }

    @GetMapping("")
    public List<TechnologiesByCandidate> getAll()
    {
        return techByCandService.getAll();
    }

    @GetMapping("/{candidate}/{tech}")
    public List<TechnologiesByCandidate> getByCandAndTech(@PathVariable(name = "candidate") long id, @PathVariable(name = "tech") String name)
    {
        return techByCandService.getTechnologiesByCandidateAndAndTechnology_NameIsLike(id,name);
    }

    @GetMapping("/{candidate}")
    public List<TechnologiesByCandidate> getByCand(@PathVariable(name = "candidate") long id)
    {
        return techByCandService.getTechnologiesByCandidate(id);
    }

/*    @GetMapping("/all/{tech}")
    public List<TechnologiesByCandidate> getAllByTech(@PathVariable(name = "tech") String name)
    {
        return techByCandService.getTechnologiesByTechnology_NameIsLike(name);
    }*/

}

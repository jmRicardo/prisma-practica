package com.moby.prisma.jmr.prismapractica.controllers;

import com.moby.prisma.jmr.prismapractica.models.entities.TechnologiesByCandidate;
import com.moby.prisma.jmr.prismapractica.services.TechByCandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TechByCandController
{
    private final TechByCandService techByCandService;

    public TechByCandController(TechByCandService techByCandService) {
        this.techByCandService = techByCandService;
    }

    @GetMapping("tbc/all")
    public List<TechnologiesByCandidate> getAll()
    {
        return techByCandService.getAll();
    }
}

package com.moby.prisma.jmr.prismapractica.controllers;

import com.moby.prisma.jmr.prismapractica.models.entities.Technology;
import com.moby.prisma.jmr.prismapractica.services.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tech")
public class TechnologyController {

    private final TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping
    public List<Technology> getAll()
    {
        return technologyService.getAll();
    }


}

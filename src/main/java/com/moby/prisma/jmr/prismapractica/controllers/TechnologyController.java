package com.moby.prisma.jmr.prismapractica.controllers;

import com.moby.prisma.jmr.prismapractica.models.entities.Technology;
import com.moby.prisma.jmr.prismapractica.services.TechnologyService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Technology get(@PathVariable long id)
    {
        return technologyService.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody Technology technology)
    {
        technologyService.add(technology);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Technology technology, @PathVariable long id)
    {
        technology.setId(id);
        technologyService.update(technology);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        technologyService.delete(id);
    }

}

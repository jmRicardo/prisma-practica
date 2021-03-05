package com.moby.prisma.jmr.prismapractica.controllers;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.services.CandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping()
    public List<Candidate> getAll()
    {
        return candidateService.getAll();
    }

    @GetMapping("/{id}")
    public Candidate get(@PathVariable long id)
    {
        return candidateService.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody Candidate candidate)
    {
        candidateService.add(candidate);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Candidate candidate, @PathVariable long id)
    {
        candidateService.update(candidate,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        candidateService.delete(id);
    }


}

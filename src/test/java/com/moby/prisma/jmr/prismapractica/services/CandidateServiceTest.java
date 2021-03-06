package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.repositories.CandidateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

class CandidateServiceTest {

    private static final long ID_STOCK = 1;

    private static final long ID_BRAND_MODEL = 1;

    public static final long ID_BRAND = 1;

    @Mock
    CandidateRepository candidateRepository;

    @InjectMocks
    CandidateService candidateService;

    @Mock
    List<Candidate> candidateList;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void getAll() {

        when(candidateRepository.findAll()).thenReturn(candidateList);

        List<Candidate> listResult = candidateService.getAll();

        assertEquals(candidateList, listResult);

        verify(candidateRepository, times(1)).findAll();
    }

    @Test
    void add() {
    }

    @Test
    void getById() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getExpByTech() {
    }
}
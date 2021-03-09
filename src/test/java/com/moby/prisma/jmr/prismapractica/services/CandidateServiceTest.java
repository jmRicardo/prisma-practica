package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.repositories.CandidateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

class CandidateServiceTest {

    private static final long ID_CANDIDATE = 1;

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
    void updateThrowEntityNotFound() {

        Candidate candidate = mock(Candidate.class);

        when(candidateRepository.save(candidate)).thenThrow(EntityNotFoundException.class);

        assertThrows(EntityNotFoundException.class, () -> candidateService.update(candidate));
    }

    @Test
    void updateSuccess() {

/*        Candidate candidate = mock(Candidate.class);
        Candidate candidate2 = mock(Candidate.class);

        when(candidateRepository.findById(ID_CANDIDATE)).thenReturn(Optional.ofNullable(candidate2));

        candidateService.update(candidate);

        verify(candidateRepository,times(1)).save(candidate);*/
    }

    @Test
    void delete() {

        Candidate candidateDB = mock(Candidate.class);

        Candidate candidateUdpdate = mock(Candidate.class);

        when(candidateRepository.findById(ID_CANDIDATE)).thenReturn(Optional.ofNullable(candidateDB));
    }


    @Test
    void deleteError() {

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

        Candidate candidate = mock(Candidate.class);

        candidateService.add(candidate);

        verify(candidateRepository,times(1)).save(candidate);
    }

    @Test
    void getByIdNotFound() {

        when(candidateRepository.findById(ID_CANDIDATE)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> candidateService.getById(ID_CANDIDATE));
    }

    @Test
    void findByIdSuccess()
    {
        Candidate candidate = mock(Candidate.class);

        when(candidateRepository.findById(ID_CANDIDATE)).thenReturn(Optional.ofNullable(candidate));

        Candidate data = candidateService.getById(ID_CANDIDATE);

        verify(candidateRepository,times(1)).findById(ID_CANDIDATE);

        assertEquals(candidate,data);
    }

}
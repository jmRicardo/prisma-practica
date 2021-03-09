package com.moby.prisma.jmr.prismapractica.services;

import com.moby.prisma.jmr.prismapractica.models.entities.Technology;
import com.moby.prisma.jmr.prismapractica.repositories.TechByCandRepository;
import com.moby.prisma.jmr.prismapractica.repositories.TechnologyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.openMocks;

class TechnologyServiceTest {

    private static final long ID_TECHNOLOGY = 1;

    @Mock
    TechnologyRepository techRepository;

    @InjectMocks
    TechnologyService technologyService;

    @Mock
    List<Technology> technologyList;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }


    @Test
    void updateThrowEntityNotFound() {

        Technology technology = mock(Technology.class);

        when(techRepository.save(technology)).thenThrow(EntityNotFoundException.class);

        assertThrows(EntityNotFoundException.class, () -> technologyService.update(technology));
    }

    @Test
    void updateSuccess() {

    }

    @Test
    void delete() {

        Technology technology = mock(Technology.class);

        when(techRepository.findById(ID_TECHNOLOGY)).thenReturn(Optional.ofNullable(technology));
    }


    @Test
    void deleteError() {

    }


    @Test
    void getAll() {

        when(techRepository.findAll()).thenReturn(technologyList);

        List<Technology> listResult = technologyService.getAll();

        assertEquals(technologyList, listResult);

        verify(techRepository, times(1)).findAll();
    }

    @Test
    void add() {

        Technology technology = mock(Technology.class);

        technologyService.add(technology);

        verify(techRepository,times(1)).save(technology);
    }

    @Test
    void getByIdNotFound() {

        when(techRepository.findById(ID_TECHNOLOGY)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> technologyService.getById(ID_TECHNOLOGY));
    }

    @Test
    void findByIdSuccess()
    {
        Technology technology = mock(Technology.class);

        when(techRepository.findById(ID_TECHNOLOGY)).thenReturn(Optional.ofNullable(technology));

        Technology data = technologyService.getById(ID_TECHNOLOGY);

        verify(techRepository,times(1)).findById(ID_TECHNOLOGY);

        assertEquals(technology,data);
    }
}
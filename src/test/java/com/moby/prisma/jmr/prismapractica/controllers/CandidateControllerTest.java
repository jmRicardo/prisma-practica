package com.moby.prisma.jmr.prismapractica.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import com.moby.prisma.jmr.prismapractica.services.CandidateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(CandidateController.class)
class CandidateControllerTest {

    private static final long ID_CANDIDATE = 1;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CandidateService candidateService;

    @Mock
    List<Candidate> candidateList;

    @BeforeEach
    void setUp()
    {
        openMocks(this);
        candidateList = new ArrayList<>();
    }

    @Test
    void getByIdNotFound() throws Exception {

        when(candidateService.getById(ID_CANDIDATE)).thenThrow(EntityNotFoundException.class);

        String response = "{\"message\":\"Entidad no encontrada! no existe en la BD\"}";

        mockMvc.perform(get("/candidate/" + ID_CANDIDATE).with(httpBasic("boon","12345678")))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(response));
    }

    @Test
    void getByIdSuccess() throws Exception {

        String candidateJSON = "";

        Candidate candidate = new Candidate();
        candidate.setId(ID_CANDIDATE);

        candidateJSON =  objectMapper.writeValueAsString(candidate);

        when(candidateService.getById(ID_CANDIDATE)).thenReturn(candidate);

        mockMvc.perform(get("/candidate/" + ID_CANDIDATE).with(httpBasic("boon","12345678"))).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(candidateJSON));
    }


    @Test
    void getAllCandidates() throws Exception {

        candidateList.add(new Candidate());
        String candidateListJSON = "";

        candidateListJSON =  objectMapper.writeValueAsString(candidateList);

        when(candidateService.getAll()).thenReturn(candidateList);

        mockMvc.perform(get("/candidate").with(httpBasic("boon","12345678"))).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(candidateListJSON));
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}
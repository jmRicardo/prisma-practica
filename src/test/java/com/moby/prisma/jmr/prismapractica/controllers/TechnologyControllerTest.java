package com.moby.prisma.jmr.prismapractica.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moby.prisma.jmr.prismapractica.models.entities.Technology;
import com.moby.prisma.jmr.prismapractica.services.TechnologyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TechnologyControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    TechnologyService technologyService;

    @Mock
    List<Technology> technologyList;


    @BeforeEach
    void setUp() {
        openMocks(this);
        technologyList = new ArrayList<>();
    }

    @Test
    @WithMockUser("noob")
    void getAll() throws Exception {

        technologyList.add(new Technology());
        String stockListJSON = "";

        try {
            stockListJSON =  new ObjectMapper().writeValueAsString(technologyList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        when(technologyService.getAll()).thenReturn(technologyList);

        mockMvc.perform(get("/tech")).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(stockListJSON));
    }

/*    @Test
    void get() {
    }*/

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
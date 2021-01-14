package com.galvanize.gc.heros.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase

public class VillainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getVillains_returnsAllVillains() throws Exception {
        mockMvc.perform(get("/api/villains"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value(3));
    }

    @Test
    public void getVillainByHeroName_returnsVillain() throws Exception {
        mockMvc.perform(get("/api/villains/Electro"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.archRival").value("Spiderman"))
                .andExpect(jsonPath("$.name").value("Maxwell Dillon"));

    }
}

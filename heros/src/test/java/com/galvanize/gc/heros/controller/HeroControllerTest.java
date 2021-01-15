package com.galvanize.gc.heros.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.gc.heros.model.Hero;
import org.junit.jupiter.api.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HeroControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    List<Hero> heroes;

    @BeforeAll
    void setup() throws Exception {
        String heroesJsonPath = "src/test/data/allHeroes.json";
        File heroesJsonPath1 = new File(heroesJsonPath);
        heroes = mapper.readValue(heroesJsonPath1, new TypeReference<ArrayList<Hero>>() {
        });
        mockMvc.perform(post("/api/heroes")
                .content(mapper.writeValueAsString(heroes))
                .contentType(MediaType.APPLICATION_JSON)
        ).andDo(print())
                .andExpect(status().isCreated());

    }

    @Test
    public void getHeroes_returnsAllHeroes() throws Exception {
        mockMvc.perform(get("/api/heroes"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value(4));

    }

    @Test
    public void getHeroByName_returnsHero() throws Exception {
        mockMvc.perform(get("/api/heroes/Batman"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(jsonPath("$.name").value("Bruce Wayne"))
                .andExpect(jsonPath("$.agility").value(50));
    }

    @Test
    public void getHeroByName_returnsHero_FailCase() throws Exception {
        mockMvc.perform(get("/api/heroes/Arjuna"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

}




package com.galvanize.gc.heros.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.gc.heros.model.Favorite;
import com.galvanize.gc.heros.repository.FanRepository;
import com.galvanize.gc.heros.service.FanService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@SpringBootTest
//@AutoConfigureMockMvc
//@AutoConfigureTestDatabase
@EnableWebMvc
@WebMvcTest(FanController.class)
public class FanControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @MockBean
    FanService fanService;

    @MockBean
    FanRepository fanRepository;

    @Test
    public void createFavorites_emptyList() throws Exception {

        Favorite batman = new Favorite("Batman");
        Favorite superman = new Favorite("Superman");
        String jsonBatman = mapper.writeValueAsString(batman);
        String jsomSuperman = mapper.writeValueAsString(superman);
        when(fanService.createFavorite(batman)).thenReturn(batman);

        //when(fanService.createFavorite(new Favorite("Batman"))).thenReturn(new Favorite("Batman"));
        System.out.println("-======-"+fanService.createFavorite(batman));
        mockMvc.perform(post("/api/fan/favorites")
                .content(jsonBatman)
                .contentType(MediaType.APPLICATION_JSON)
        ).andDo(print())
                .andExpect(status().isCreated())
                //.andExpect(jsonPath("id").isNotEmpty())
                .andExpect(jsonPath("$.heroName").value("Batman"));

    }



//    @Test
//    public void getAllFavoriteHeroes() throws Exception {
//        mockMvc.perform(get("/api/fan/favorites"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.length()").value(0));
//
//    }
//
//    @Test
//    public void createFavorites() throws Exception {
//        mockMvc.perform(post("/api/fan/favorites")
//                .content("Batman")
//                .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                //.andExpect(jsonPath("$.length()").value(1));
//                .andExpect(jsonPath("$.heroName").value("Batman"));
//    }
//
//    @Test
//    public void removeFavoriteHero() throws Exception {
//        mockMvc.perform(post("/api/fan/favorites")
//                .content("Batman")
//                .contentType(MediaType.APPLICATION_JSON)
//        ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                //.andExpect(jsonPath("$.length()").value(1));
//                .andExpect(jsonPath("$.heroName").value("Batman"));
//
//        mockMvc.perform(delete("/api/fan/favorites/Batman"))
//                .andExpect(status().isOk());
//    }


}

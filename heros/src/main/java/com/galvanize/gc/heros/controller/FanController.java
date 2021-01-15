package com.galvanize.gc.heros.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FanController {


    @PostMapping("/api/fan/favorites")
    @ResponseStatus(HttpStatus.CREATED)
    public List<String> createFavourites(){
        return new ArrayList<>();
    }

}

package com.galvanize.gc.heros.service;

import com.galvanize.gc.heros.model.Favorite;
import com.galvanize.gc.heros.repository.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FanService {

    @Autowired
    FanRepository fanRepository;

    public Favorite createFavorite(Favorite favorite){
        return  fanRepository.save(favorite);
    }

}

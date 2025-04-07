package com.CRUDPROJECT.CRUDPRO.Service;

import com.CRUDPROJECT.CRUDPRO.Models.Marvel;
import com.CRUDPROJECT.CRUDPRO.Repository.SuperHero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRUD_Service {

    @Autowired
    SuperHero superHero;
    public void createSuperhero(Marvel marvel){

        superHero.save(marvel);
    }
}

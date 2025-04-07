package com.CRUDPROJECT.CRUDPRO.Controller;

import com.CRUDPROJECT.CRUDPRO.Models.Marvel;
import com.CRUDPROJECT.CRUDPRO.Service.CRUD_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crud_controller {
    //CRUD
    @Autowired
    CRUD_Service crudService;

    //Create endpoint -> POST

    @PostMapping(path = "/create")
    public void createSuperhero(@RequestBody Marvel superhero){
        crudService.createSuperhero(superhero);
    }

//    @GetMapping("/ping")
//    public String ping(){
//        return "App is running and DB is Connected!!";
//    }
}

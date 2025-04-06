package com.CRUDPROJECT.CRUDPRO.Controller;

import com.CRUDPROJECT.CRUDPRO.Models.Marvel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crud_controller {
    //CRUD

    //Create endpoint -> POST

    @PostMapping(path = "/create")
    public void createsuperhero(@RequestBody Marvel superhero){

    }

    @GetMapping("/ping")
    public String ping(){
        return "App is running and DB is Connected!!";
    }
}

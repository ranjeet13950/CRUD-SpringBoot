package com.CRUDPROJECT.CRUDPRO.Controller;

import com.CRUDPROJECT.CRUDPRO.Models.Marvel;
import com.CRUDPROJECT.CRUDPRO.Service.CRUD_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //Read endpoint
    @GetMapping("/read")
    public ResponseEntity<Marvel> getHeroById(@RequestParam(name = "id") int val) {
        Marvel hero = crudService.GetHeroById(val);
        if (hero != null) {
            return ResponseEntity.ok(hero);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    //Update endPoint
    @PutMapping("/update")
    public void updateSuperheroname(@RequestBody Marvel superhero,@RequestParam(name = "id") int id){
        crudService.updateSuperheroname(superhero,id);
    }

    //Delete Mapping
    @DeleteMapping("delete")
    public void deleteSuperHero(@RequestParam(name = "id")int id){
        crudService.deleteSuperhero(id);
    }
}

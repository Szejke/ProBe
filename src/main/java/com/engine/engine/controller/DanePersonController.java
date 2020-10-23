package com.engine.engine.controller;

import com.engine.engine.model.DanePerson;
import com.engine.engine.repository.DanePersonRepository;
import com.engine.engine.service.DanePersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor

@CrossOrigin(origins = "*")
public class DanePersonController {

    private final DanePersonService danePersonService;


    @GetMapping("/dane-persons")
    public List<DanePerson> getDanePersons(){
        return danePersonService.getDanePersons();
    }

    @PostMapping("/insert-dane-person")
    public DanePerson insertDanePerson(@RequestBody DanePerson danePerson){
        System.out.println(danePerson);
        return danePersonService.insertDanePerson(danePerson);
    }
    @PutMapping("/edit-dane-person")
    public DanePerson editDanePerson(@RequestBody DanePerson danePerson){
        return danePersonService.editDanePerson(danePerson);
    }


    @CrossOrigin(origins = "*")
    @DeleteMapping("/delete-dane-person/{id}")
    public void deleteDanePerson(@PathVariable Long id){
        danePersonService.deleteDanePerson(id);
    }

}

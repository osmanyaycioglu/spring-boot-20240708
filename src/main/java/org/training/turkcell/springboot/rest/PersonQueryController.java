package org.training.turkcell.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.training.turkcell.springboot.rest.models.PersonDto;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person/query")
public class PersonQueryController {

    @GetMapping("/get/one")
    public PersonDto getOne(@RequestParam Long personId){
        return null;
    }

    @GetMapping("/get/all")
    public List<PersonDto> getAll(){
        return null;
    }

    @GetMapping("/get/by/surname")
    public List<PersonDto> getOne(@RequestParam String surname){
        return null;
    }

}

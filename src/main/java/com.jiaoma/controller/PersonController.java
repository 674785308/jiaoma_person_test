package com.jiaoma.controller;

import com.jiaoma.dao.UsersRepository;
import com.jiaoma.pojo.Person;
import com.jiaoma.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(path = "addPerson")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Integer id) {
        personService.deletePerson(id);
    }
    @GetMapping(path = "findById")
    public void findById(Integer id){
        personService.findById(id);
    }
    @PutMapping(path = "update")
    public void update(@RequestBody Person person){
        personService.update(person);
    }

}

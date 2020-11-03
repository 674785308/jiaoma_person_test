package com.jiaoma.controller;

import com.jiaoma.dao.UsersRepository;
import com.jiaoma.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private UsersRepository usersRepository;

    @PostMapping(path = "addPerson")
    public void addPerson(@RequestBody Person person) {
        usersRepository.save(person);
    }
    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Integer id) {

    }
}

package com.jiaoma.controller;

import com.jiaoma.pojo.Person;
import com.jiaoma.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;

    /**
     * 添加方法
     * @param person
     */
    @PostMapping(path = "addPerson")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    /**
     * 删除方法
     * @param id
     */
    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Integer id) {
        personService.deletePerson(id);
    }

    /**
     * 通过id查询
     * @param id
     */
    @GetMapping(path = "findById")
    public void findById(Integer id){
        personService.findById(id);
    }

    /**
     * 修改方法
     * @param person
     */
    @PutMapping(path = "update")
    public void update(@RequestBody Person person){
        personService.update(person);
    }

}

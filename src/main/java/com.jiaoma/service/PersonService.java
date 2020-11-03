package com.jiaoma.service;

import com.jiaoma.dao.UsersRepository;
import com.jiaoma.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private UsersRepository usersRepository;
    public void addPerson(@RequestBody Person person) {
         usersRepository.save(person);

    }

    public void deletePerson(Integer id) {
        usersRepository.deleteById(id);
    }
    public void findById(Integer id){
        Optional<Person> person = usersRepository.findById(id);
        if (person.isPresent()){
            Person person1 = person.get();
            System.out.println(person1);
        }
    }
    public void update(Person person){
        usersRepository.save(person);
    }

}

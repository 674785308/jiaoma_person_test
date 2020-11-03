package com.jiaoma.stu.service.impl;

import com.jiaoma.stu.dao.UsersRepository;
import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private UsersRepository usersRepository;

    /**
     *
     * 添加方法
     * @param person
     */
    @Override
    public void addPerson(Person person) {
        usersRepository.save(person);
    }

    /**
     * 删除方法
     * @param id
     */
    @Override
    public void deletePerson(Integer id) {
        usersRepository.deleteById(id);
    }

    /**
     * 通过id查询
     * @param id
     */
    @Override
    public void findById(Integer id) {
        Optional<Person> person = usersRepository.findById(id);
        if (person.isPresent()){
            Person person1 = person.get();
            System.out.println(person1);
        }
    }

    /**
     * 修改方法
     * @param person
     */
    @Override
    public void update(Person person) {
        usersRepository.save(person);
    }
}

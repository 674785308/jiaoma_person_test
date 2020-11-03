package com.jiaoma.stu.test;

import com.jiaoma.stu.dao.UsersRepository;
import com.jiaoma.stu.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {
    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void testSave() {
        Person person = new Person();
        person.setName("lisi");
        person.setSex("nv");
        usersRepository.save(person);
    }

    @Test
    public void testDelete() {
        usersRepository.deleteById(8);
    }

    @Test
    public void testFind() {
        List<Person> all = usersRepository.findAll();
        for (Person person : all) {
            System.out.println(person);
        }

    }

    @Test
    public void testFindById() {
        Optional<Person> byId = usersRepository.findById(13);
        if (byId.isPresent()) {
            Person person = byId.get();
            System.out.println(person);
        }

    }

    @Test
    public void testFindByName() {
        Person person = usersRepository.findByName("zhangsan");
        if (person != null) {
            System.out.println(person);
        }
    }

    @Test
    public void testFindByNameAndSex() {
        Person person = usersRepository.findByNameAndSex("lisi", "nan");
        System.out.println(person);
        if (person != null) {
            System.out.println(person);
        }
    }

    @Test
    public void testUpdate() {
        Person person = new Person();
        person.setId(13);
        person.setName("wangwu");
        person.setSex("nan");
        usersRepository.save(person);
    }

    @Test
    public void testFindSQL() {
        List<Person> sql = usersRepository.findSQL("zhangsan", "11");
        for (Person person : sql) {
            System.out.println(person);
        }

    }
}

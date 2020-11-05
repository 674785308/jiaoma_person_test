package com.jiaoma.stu.test;

import com.jiaoma.stu.dao.PersonConverter;
import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.pojo.PersonDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonConverterTest {
    @Test
    public void test() {
     /*   Person1111 person = new Person1111(1L,"zhige","zhige.me@gmail.com",new Date(),new User(1));
        PersonDTO personDTO = PersonConverter.INSTANCE.domain2dto(person);
        assertNotNull(personDTO);
        assertEquals(personDTO.getId(), person.getId());
       assertEquals(personDTO.getName(), person.getName());
       assertEquals(personDTO.getBirth(), person.getBirthday());


        List<Person1111> people = new ArrayList<>();
        people.add(person);
        List<PersonDTO> personDTOs = PersonConverter.INSTANCE.domain2dto(people);
        assertNotNull(personDTOs);*/
        Person person1 = new Person(1,"wwy","nan");
        PersonDTO personDTO1 = PersonConverter.INSTANCE.domain2dto(person1);
        assertNotNull(personDTO1);
        System.out.println(person1);
        System.out.println(personDTO1);
    }
}

package com.jiaoma.stu.dao;

import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.pojo.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);
    PersonDTO domain2dto(Person person);
    Person domainConcerter(PersonDTO personDTO);

}

package com.jiaoma.stu.mapper;

import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE =Mappers.getMapper(PersonConverter.class);

    Person personDtoToPerson(PersonDto personDto);

}

package com.jiaoma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jiaoma.pojo.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Person,Integer>{
    Person findByName(String name);
    Person findByNameAndSex(String name,String sex);
    @Query(nativeQuery = true,value = "select * from person where name = :name1 or name = :name2")
    List<Person> findSQL(@Param("name1") String name1, @Param("name2") String name2);
}
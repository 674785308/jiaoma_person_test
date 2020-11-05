package com.jiaoma.stu.dao;

import com.jiaoma.stu.pojo.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Person,Integer>{
    Person findByName(String name);
    Person findByNameAndSex(String name,String sex);
    @Query(nativeQuery = true,value = "select * from person where name = :name1 or name = :name2")
    List<Person> findSQL(@Param("name1") String name1, @Param("name2") String name2);
}
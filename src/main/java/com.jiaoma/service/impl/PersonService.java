package com.jiaoma.service.impl;

import com.jiaoma.pojo.Person;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonService {
    /**
     * 添加方法
     * @param person
     */
    void addPerson(@RequestBody Person person);

    /**
     * 删除方法
     * @param id
     */
    void deletePerson(Integer id);

    /**
     * 通过ID查询
     * @param id
     */
    void findById(Integer id);

    /**
     * 修改方法
     * @param person
     */
    void update(Person person);

}

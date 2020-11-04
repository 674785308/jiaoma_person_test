package com.jiaoma.stu.service;

import com.jiaoma.stu.pojo.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PersonService {
    /**
     * 添加方法
     * @param person
     */
    void addPerson(Person person);

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

    /**
     * 分页查询
     * @return
     */
    Page<Person> queryByPage(PageRequest pageRequest);

}

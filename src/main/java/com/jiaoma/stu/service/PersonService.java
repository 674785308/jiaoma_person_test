package com.jiaoma.stu.service;

import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.pojo.PersonDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface PersonService {
    /**
     * 添加方法
     * @param personDTO
     */
    void addPerson(PersonDTO personDTO);

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
     * @param
     */
    void update(PersonDTO personDTO);

    /**
     * 分页查询
     * @return
     */
    Page<Person> queryByPage(PageRequest pageRequest);

}

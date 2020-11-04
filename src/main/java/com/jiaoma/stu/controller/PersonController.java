package com.jiaoma.stu.controller;

import com.jiaoma.stu.dao.PersonRepositoryPagingAndSorting;
import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.service.impl.PersonServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "/person")
@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;

    /**
     * 添加方法
     * @param person
     */
    @ApiOperation(value = "新增用户",notes="详细描述")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK") })
    @PostMapping(path = "addPerson")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    /**
     * 删除方法
     * @param id
     */
    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Integer id) {
        personService.deletePerson(id);
    }

    /**
     * 通过id查询
     * @param id
     */
    @GetMapping(path = "findById")
    public void findById(Integer id){
        personService.findById(id);
    }

    /**
     * 修改方法
     * @param person
     */
    @PutMapping(path = "update")
    public void update(@RequestBody Person person){
        personService.update(person);
    }

    /**
     * 分页查询
     */
    @ApiOperation(value = "分页查询",notes="")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK") })
    @ApiImplicitParams( {
            @ApiImplicitParam(paramType = "query", name = "page", dataType = "int", required = true,
                    value = "当前页", defaultValue = "1",dataTypeClass = Integer.class),
            @ApiImplicitParam(paramType = "query", name = "limit", dataType = "int", required = true,
                    value = "每页显示数据数量", defaultValue = "10",dataTypeClass = Integer.class),
            @ApiImplicitParam(paramType = "query", name = "sidx", dataType = "String", required = false,
                    value = "排序字段", defaultValue = "",dataTypeClass = String.class),
            @ApiImplicitParam(paramType = "query", name = "sord", dataType = "String", required = false,
                    value = "排序规则", defaultValue = "",dataTypeClass = String.class)
    })
    @PostMapping(path = "queryByPage")
    public Page<Person> queryByPage(PageRequest pageRequest){
        Page<Person> page = personService.queryByPage(pageRequest);
        return page;
    }

}

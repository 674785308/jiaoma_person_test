package com.jiaoma.stu.controller;


import com.jiaoma.stu.pojo.Person;
import com.jiaoma.stu.service.impl.PersonServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"个人"})
@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;

    /**
     * 添加方法
     * @param person
     */
    @ApiOperation(value = "新增用户",notes="详细描述")
    @PostMapping(value = "/addPerson")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    /**
     * 删除方法
     * @param id
     */
    @DeleteMapping(value = "/deletePerson")
    public void deletePerson(Integer id) {
        personService.deletePerson(id);
    }

    /**
     * 通过id查询
     * @param id
     */
    @GetMapping(value = "/findById")
    public void findById(Integer id){
        personService.findById(id);
    }

    /**
     * 修改方法
     * @param person
     */
    @PutMapping(value = "/update")
    public void update(@RequestBody Person person){
        personService.update(person);
    }

    /**
     * 分页查询
     */
    @ApiOperation(value = "分页查询",notes="")

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
    @PostMapping(value = "/queryByPage")
    public Page<Person> queryByPage(@ApiIgnore PageRequest pageRequest){
        Page<Person> page = personService.queryByPage(pageRequest);
        return page;
    }

}

package com.jiaoma.stu.controller;

import com.jiaoma.stu.pojo.AddUserParam;
import com.jiaoma.stu.pojo.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    private  DataSource dataSource;
    @GetMapping("hello")
    public String hello(){
        System.out.println("dataSource = " + dataSource);
        return "hello,person";
    }




    @ApiOperation(value = "新增用户",notes="详细描述")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK") })
    @PostMapping("/user")
    public Person addUser(@RequestBody AddUserParam param) {
        System.err.println(param.getName());
        return new Person();
    }


}

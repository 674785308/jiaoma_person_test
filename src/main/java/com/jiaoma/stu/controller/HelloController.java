package com.jiaoma.stu.controller;

import com.jiaoma.stu.pojo.AddUserParam;
import com.jiaoma.stu.pojo.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    //private  DataSource dataSource;
    @GetMapping("hello")
    public String hello(){
        //System.out.println("dataSource = " + dataSource);
        return "hello,person";
    }



    @PostMapping("/user")
    public Person addUser(@RequestBody AddUserParam param) {
        System.err.println(param.getName());
        return new Person();
    }


}

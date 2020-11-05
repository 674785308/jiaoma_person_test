package com.jiaoma.stu.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "person对象模型", description = "")
public class PersonDto {

    @ApiModelProperty(value = "ID")
    private Integer id;
    @ApiModelProperty(value = "名字")

    private String name;
    @ApiModelProperty(value = "性别")

    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

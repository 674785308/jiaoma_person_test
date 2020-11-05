package com.jiaoma.stu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@ApiModel(value = "person对象模型", description = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDTO {
    @ApiModelProperty(value = "ID")
    private Integer id;
    @ApiModelProperty(value = "名字")
    private String name;
    @ApiModelProperty(value = "性别")
    private String sex;

}

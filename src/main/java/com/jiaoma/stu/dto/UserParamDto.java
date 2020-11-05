package com.jiaoma.stu.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "person对象模型", description = "")
@Data
public class UserParamDto {
    @ApiModelProperty(value = "ID")
    private Integer id;
    @ApiModelProperty(value = "名称")
    @Setter
    @Getter
    private String userName;
    @ApiModelProperty(value = "性别")
    private String sex;
}

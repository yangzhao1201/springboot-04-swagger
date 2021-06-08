package com.yang.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author TangYuan
 * @create 2021--06--08--15:24
 * @description
 */

@ApiModel("用户名实体类")
public class User {
    @ApiModelProperty("用户名")
    public String name;
    @ApiModelProperty("密码")
    public String password;
}

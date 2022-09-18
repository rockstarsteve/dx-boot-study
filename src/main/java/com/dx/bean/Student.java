package com.dx.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author rockstarsteve
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2021/11/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "学生对象", description = "")
public class Student {

    @ApiModelProperty(value = "学生名称", notes = "")
    private String name;
    @ApiModelProperty(value = "学生年龄", notes = "")
    private int age;

}

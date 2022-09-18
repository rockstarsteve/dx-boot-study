package com.dx.controller;

import com.dx.bean.Student;
import com.dx.bean.Techer;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author rockstarsteve
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2021/11/27
 */
@Api(tags = "1.老师控制类")
@RestController
@RequestMapping("/teacher")
@ApiSort(1)
public class TeacherController {

    @ApiOperation(value = "测试老师", notes = "查询当个老师信息", response = Techer.class)
    @ApiImplicitParams(
            value =
                    {
                            @ApiImplicitParam(paramType = "body", name = "name", value = "老师名称", required = true),
                            @ApiImplicitParam(paramType = "body", name = "subject", value = "所教科目", required = true, example = "体育"),
                    }
    )
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "ok"),
                    @ApiResponse(code = 555, message = "乱七八糟的")
            }
    )
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/select")
    public Techer select(@RequestBody Techer techer) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("tom", 12));
        studentList.add(new Student("miller", 23));

        Techer techer1 = new Techer(techer.getName(), techer.getSubject(), studentList);

        return techer1;
    }

    /**
     * 自定义测试方法
     */
    @ApiOperation(value = "自定义测试方法", notes = "", response = Object.class)
    @ApiOperationSupport(order = 2)
    @PostMapping(value = "/test")
    public Object test() {


        return "ok";
    }

}

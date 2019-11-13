package com.jguo3.school.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jguo3.school.user.User;
import com.jguo3.school.validation.JsonResult;
import com.jguo3.school.validation.ValidationUtils;


/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 12, 2019 3:36:12 PM
 * 
 */
public class SpringMVCDemoController {
	Logger LOGGER = Logger.getLogger(SpringMVCDemoController.class); 
    /**
     * <p>简单测试注解、校验和JsonResult</p>
     * @author hanchao 2018/2/7 23:27
     **/
    @PostMapping("/mvc/login")
    @ResponseBody
    public JsonResult<User> loginTest(@Valid @RequestBody User user, BindingResult bindingResult){
        LOGGER.info(user.toString());
        //定义返回值
        JsonResult<User> jsonResult = new JsonResult<User>();
        //表单校验
        if (ValidationUtils.validateAndSetJsonResult(bindingResult,jsonResult)){//如果没错误
            List<User> list = new ArrayList<User>();
            list.add(user);
            jsonResult.setList(list);
        }
        //返回结果
        return jsonResult;
    }
}

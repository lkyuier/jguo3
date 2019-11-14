package com.jguo3.school.validation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: TODO
 * @author jguo3
 * @version V1.0
 * Date:Nov 14, 2019 3:42:05 PM
 */
@Controller
@RequestMapping("validation")
public class studentManageController {
	/**
     * <p>注册学生信息</p>
     * @author jguo3
     **/
    @PostMapping("/insert")
    @ResponseBody
    public JsonResult insert(@Validated(insertGroup.class) @RequestBody student student, BindingResult bindingResult){
        JsonResult jsonResult = new JsonResult();
        validate(bindingResult, jsonResult);
        System.out.println(jsonResult.toString());
        return jsonResult;
    }

    /**
     * <p>修改学生信息</p>
     * @author jguo3
     **/
    @PostMapping("/update")
    @ResponseBody
    public JsonResult update(@Validated(updateGroup.class) @RequestBody student student, BindingResult bindingResult){
        JsonResult jsonResult = new JsonResult();
        validate(bindingResult, jsonResult);
        System.out.println(jsonResult.toString());
        return jsonResult;
    }

    /**
     * <p>对bindingResult进行校验</p>
     * @author jguo3
     **/
    private void validate(BindingResult bindingResult, JsonResult jsonResult) {
        if (bindingResult.hasErrors()){
            StringBuffer errors = new StringBuffer();
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : allErrors){
                errors.append(objectError.getDefaultMessage() + "<br/>");
            }
            jsonResult.setCodeAndMessage("0",errors.toString());
        }
    }
}


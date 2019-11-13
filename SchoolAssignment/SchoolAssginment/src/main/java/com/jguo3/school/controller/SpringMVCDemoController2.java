package com.jguo3.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 11, 2019 4:16:29 PM
 * 
 */
@Controller
public class SpringMVCDemoController2 {
	@GetMapping("/mvc/test")
    public String mvcTest(Model model){
        model.addAttribute("mvc","Spring + Spring MVC is OK!");
        return "mvc";
    }

}

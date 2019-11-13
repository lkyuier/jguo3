/**
 * Copyright 2019 Jguo3 Studio
 * 
 * All right reserved
 *
 * Created on Nov 11, 2019 4:35:10 PM
 *
 * 
 */
package com.jguo3.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 11, 2019 4:35:10 PM
 * 
 */
@Controller
public class HelloController {
	
	@GetMapping("/helloworld")
    public String helloWorld(Model model){
        model.addAttribute("helloworld","Hi Spring MVC");
        return  "helloworld/helloworld";
    }

}

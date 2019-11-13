package com.jguo3.school.htmlviewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 13, 2019 3:35:31 PM
 * 
 */
@Controller
@RequestMapping("/htmlviewresolver")
public class multiViewController {
	/**
     * <p>跳转到jsp页面</p>
     * @author jguo3
     **/
    @GetMapping("/returnjsp")
    public String getJsp(){
    	System.out.println("============>>>222");
        return "/htmlviewresolver/hellojsp";
    }

    /**
     * <p>跳转到html页面</p>
     * @author jguo3
     **/
    @GetMapping("/returnhtml")
    public String getHtml(){
    	System.out.println("============>>>111");
        return "/htmlviewresolver/hellohtml";
    }

}

package com.tanfei.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * µÇÂ¼¿ØÖÆÆ÷
 * @author tanfei
 * @date Feb 1, 2013 9:38:13 AM
 */
@Controller
public class LoginController {
 
    @RequestMapping("/login")
    public String toLogin()
    {
       return "login";
    }
}
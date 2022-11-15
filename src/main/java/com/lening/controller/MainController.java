package com.lening.controller;

import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/tolntraineelist")
    public String lntraineelist(){
        return "lntrainee_list";
    }


}

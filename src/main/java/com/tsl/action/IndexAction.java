package com.tsl.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexAction {

    @RequestMapping("/index.action")
    public String index(){
        return "main";
    }

    @RequestMapping("/top.action")
    public String top(){
        return "top";
    }
    @RequestMapping("/left.action")
    public String left(){
        return "left";
    }
    @RequestMapping("/right.action")
    public String right(){
        return "right";
    }
}

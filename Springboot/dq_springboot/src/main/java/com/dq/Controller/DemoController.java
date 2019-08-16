package com.dq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
@RequestMapping("/con")
public class DemoController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return "hello springboot";
    }
}

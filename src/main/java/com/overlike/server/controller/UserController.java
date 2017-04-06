package com.overlike.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "something";
    }

}

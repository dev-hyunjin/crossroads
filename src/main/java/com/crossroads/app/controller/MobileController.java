package com.crossroads.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MobileController {
    @GetMapping("join-mobile")
    public String joinMobile(){
        return "mobile/join-mobile";
    }

}

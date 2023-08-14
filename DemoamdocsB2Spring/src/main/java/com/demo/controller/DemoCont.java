package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCont {
    @RequestMapping("/get")
    public String show() {
    	return "welcome to amdocs";
    	
    }
    
    
}

package com.helloworld.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    @GetMapping("helloworld")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("message", "HelloWorld");
        modelMap.addAttribute("time", LocalDateTime.now().toString());
        return "helloworld";
    }
}

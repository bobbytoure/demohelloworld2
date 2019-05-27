package com.bobbyonline.demohelloworld2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld2 {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}

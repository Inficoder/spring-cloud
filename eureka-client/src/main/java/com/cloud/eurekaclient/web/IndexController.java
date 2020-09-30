package com.cloud.eurekaclient.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/hi")
    public String hi(){
        return "hi, cloud!";
    }
}

package com.cloud.eurekaclient.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName web
 * @Description
 * @Author Bryce
 * @Date 2020-09-30 16:16
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/hi")
    public String hi(){
        return "hi, cloud!";
    }
}

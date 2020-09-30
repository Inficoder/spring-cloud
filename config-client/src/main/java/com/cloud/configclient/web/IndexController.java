package com.cloud.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description
 * @Author Bryce
 * @Date 2020-09-30 17:07
 */
@RestController
public class IndexController {

    @Value("${version}")
    private String version;

    @Value("${demo.message}")
    private String message;

    @RequestMapping(value = "/config-test", method = RequestMethod.GET)
    public String clientTest() {
        return "get github config version:" + version + " message:"+message;
    }
}

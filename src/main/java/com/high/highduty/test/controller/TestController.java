package com.high.highduty.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxl
 * @date 2023/6/27 14:58
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/print")
    public String getTestPrint() {
        System.out.println("test成功");
        return "String";
    }

}

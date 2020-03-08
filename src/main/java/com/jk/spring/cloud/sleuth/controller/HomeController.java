package com.jk.spring.cloud.sleuth.controller;

import com.jk.spring.cloud.sleuth.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HomeService service;

    @GetMapping("/hellotwo")
    public String sayHello() {
        logger.info("hello ");
        service.sameServiceCall();
        return "Good morning SAAB.";
    }

    @GetMapping("/servicetwo")
    public String serviceone() {
        logger.info("how r u ");
        return "second controller.";
    }


}

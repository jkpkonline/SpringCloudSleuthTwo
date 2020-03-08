package com.jk.spring.cloud.sleuth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    public void sameServiceCall() {
        logger.info("now in own service");
        restTemplate.getForObject("http://localhost:8080/servicetwo", String.class);
    }

}

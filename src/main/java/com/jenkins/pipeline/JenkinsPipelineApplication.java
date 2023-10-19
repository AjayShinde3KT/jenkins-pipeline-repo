package com.jenkins.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsPipelineApplication {
    Logger logger = LoggerFactory.getLogger(JenkinsPipelineApplication.class);

    @PostConstruct
    public void init() {
        logger.info("Application Started!!!!!!!!!!!!!!!!");
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPipelineApplication.class, args);
    }

}

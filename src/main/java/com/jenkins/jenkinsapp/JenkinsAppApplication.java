package com.jenkins.jenkinsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsAppApplication {

    public static void main(String[] args) {
        System.out.println("hello jenkins");
        SpringApplication.run(JenkinsAppApplication.class, args);
    }

}

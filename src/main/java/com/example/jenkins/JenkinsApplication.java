package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

    public static void main(String[] args) {
        System.out.println("JENKINS TUTORIAL");
        SpringApplication.run(JenkinsApplication.class, args);
    }

}

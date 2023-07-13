package com.example.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("classpath:application.properties")
public class AppConfig {

}

package com.example;

import com.example.config.AppConfig;
import com.example.service.CustomerService;
import com.example.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customersService = (CustomerService) applicationContext.getBean("customerService");
        TestService testService= (TestService) applicationContext.getBean("testService");
        customersService.addCustomer("Tomek", "Czajka", "testEmail@wp.pl");
        testService.test();
    }
}
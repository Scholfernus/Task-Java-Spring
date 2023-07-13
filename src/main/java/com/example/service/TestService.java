package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private EmailSender emailSender;

    public void test() {
        emailSender.sendEmail("test@interia.pl");
    }
}

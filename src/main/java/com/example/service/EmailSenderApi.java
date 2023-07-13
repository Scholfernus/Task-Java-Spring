package com.example.service;


import com.example.config.condition.DefaultSenderCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(DefaultSenderCondition.class)
public class EmailSenderApi implements EmailSender {
    @Override
    public void sendEmail(String email) {
        System.out.println("Sending email by external Api for address " + email);
    }
}

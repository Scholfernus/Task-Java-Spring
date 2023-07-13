package com.example.service;

import com.example.config.condition.SmtpSenderConfig;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(SmtpSenderConfig.class)
public class EmailSenderSmtp implements EmailSender{
    @Override
    public void sendEmail(String email) {
        System.out.println("Sending email finished by smtp for email " + email);
    }
}

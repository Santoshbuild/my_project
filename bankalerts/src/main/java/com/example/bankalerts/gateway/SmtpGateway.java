package com.example.bankalerts.gateway;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;

@Component
@Profile("prod")
public class SmtpGateway implements MessageGateway {

    private final JavaMailSender mailSender;

    public SmtpGateway(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void send(String message, String recipient) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(recipient);
        mail.setSubject("Bank Notification");
        mail.setText(message);
        mailSender.send(mail);
    }
}
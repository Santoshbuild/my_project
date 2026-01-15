package com.example.bankalerts.service;

import com.example.bankalerts.gateway.MessageGateway;
import com.example.bankalerts.config.BankConfigProperties;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final MessageGateway gateway;
    private final BankConfigProperties config;

    public NotificationService(MessageGateway gateway, BankConfigProperties config) {
        this.gateway = gateway;
        this.config = config;
    }

    public void sendWithdrawalAlert(String recipient, double amount) {
        if (amount > config.getDailyWithdrawalLimit()) {
            String message = "Alert: Withdrawal of " + amount +
                             " exceeds daily limit of " + config.getDailyWithdrawalLimit() +
                             ". Contact support: " + config.getSupportEmail();
            gateway.send(message, recipient);
        }
    }

    public void sendOtp(String recipient, String otp) {
        String message = "Your OTP is: " + otp + ". Contact support: " + config.getSupportEmail();
        gateway.send(message, recipient);
    }
}
package com.example.bankalerts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bank.config")
public class BankConfigProperties {

    private double dailyWithdrawalLimit;
    private String supportEmail;
    private int apiTimeout;

    public double getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    public void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public int getApiTimeout() {
        return apiTimeout;
    }

    public void setApiTimeout(int apiTimeout) {
        this.apiTimeout = apiTimeout;
    }
}
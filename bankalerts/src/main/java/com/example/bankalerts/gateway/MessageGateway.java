package com.example.bankalerts.gateway;

public interface MessageGateway {
    void send(String message, String recipient);
}
package com.example.chat;

public class ChatServer {
    public void start() {
        System.out.println("Server started.");
    }

    public void stop() {
        System.out.println("Server stopped.");
    }

    public String receiveMessage() {
        return "Message received.";
    }
}

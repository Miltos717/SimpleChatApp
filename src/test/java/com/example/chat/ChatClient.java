package com.example.chat;

public class ChatClient {
    public void connect() {
        System.out.println("Client connected.");
    }

    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
    }
}

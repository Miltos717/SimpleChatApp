package com.example.chat;

public class ChatService {
    public String sendMessage(String user, String message) {
        return user + ": " + message;
    }

    public String receiveMessage() {
        return "Sample received message";
    }
}

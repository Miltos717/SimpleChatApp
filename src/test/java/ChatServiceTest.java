package com.example.chat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChatServiceTest {
    private ChatService chatService;

    @BeforeEach
    void setUp() {
        chatService = new ChatService();
    }

    @Test
    void testSendMessage() {
        String message = chatService.sendMessage("User1", "Hello");
        assertNotNull(message);
        assertTrue(message.contains("User1"));
    }
}

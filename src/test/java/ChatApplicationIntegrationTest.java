package com.example.chat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ChatApplicationIntegrationTest {
    @Test
    void testClientServerCommunication() {
        ChatServer server = new ChatServer();
        ChatClient client = new ChatClient();

        server.start();
        client.connect();

        client.sendMessage("Hello, Server!");
        String response = server.receiveMessage();

        assertEquals("Message received.", response);

        server.stop();
    }
}

package com.BKDeepseek.demo.Controller;

import org.springframework.ai.chat.client.ChatClient;

public class DeepSeekChatController {
    private final ChatClient chatClient;


    public DeepSeekChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }
}

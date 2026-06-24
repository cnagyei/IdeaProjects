package com.oath.africa.business;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AI-powered service for chatting with Odoo database using LangChain4j
 */
@Service
public class OdooAgentService {
    
    private final OdooAssistant assistant;
    
    @Autowired
    public OdooAgentService(ChatLanguageModel chatLanguageModel, OdooTools odooTools) {
        this.assistant = AiServices.builder(OdooAssistant.class)
            .chatLanguageModel(chatLanguageModel)
            .tools(odooTools)
            .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
            .build();
    }
    
    /**
     * Chat with the Odoo agent
     * @param userMessage The user's message/question
     * @return The agent's response
     */
    public String chat(String userMessage) {
        return assistant.chat(userMessage);
    }
    
    /**
     * Interface defining the AI assistant capabilities
     */
    public interface OdooAssistant {
        String chat(String userMessage);
    }
}

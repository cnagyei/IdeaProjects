package com.oath.africa.presentation;

import com.oath.africa.business.OdooAgentService;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for Odoo Agent chat interface
 */
@RestController
@RequestMapping("/api/odoo-agent")
public class OdooAgentController {
    
    private final OdooAgentService odooAgentService;
    
    public OdooAgentController(OdooAgentService odooAgentService) {
        this.odooAgentService = odooAgentService;
    }
    
    /**
     * Chat endpoint for interacting with Odoo agent
     * @param request Chat request containing the user message
     * @return Chat response with the agent's reply
     */
    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody ChatRequest request) {
        String response = odooAgentService.chat(request.getMessage());
        return new ChatResponse(response);
    }
    
    /**
     * Simple GET endpoint for testing
     */
    @GetMapping("/chat")
    public ChatResponse chatGet(@RequestParam String message) {
        String response = odooAgentService.chat(message);
        return new ChatResponse(response);
    }
    
    // Request/Response DTOs
    public static class ChatRequest {
        private String message;
        
        public ChatRequest() {}
        
        public ChatRequest(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
    }
    
    public static class ChatResponse {
        private String response;
        
        public ChatResponse() {}
        
        public ChatResponse(String response) {
            this.response = response;
        }
        
        public String getResponse() {
            return response;
        }
        
        public void setResponse(String response) {
            this.response = response;
        }
    }
}

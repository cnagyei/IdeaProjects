package com.oath.africa.config;

import com.oath.africa.presentation.StocksWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/*
You annotate a configuration class with @EnableWebSocket, which signals Spring to search for WebSocket
configuration methods — particularly those defined in an implementation of WebSocketConfigurer.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final StocksWebSocketHandler handler;

    public WebSocketConfig(StocksWebSocketHandler handler) {
        this.handler = handler;
    }

    /*
    Utilize the registerWebSocketHandlers method to register WebSocket handlers to specific URLs.
    This is how you link your custom WebSocket handler (like WebSocketHandler) with
    a URL endpoint (for instance, /stocks).
    A WebSocketHandlerRegistry serves as storage where you can add multiple WebSocket handlers and
    associate them with specific URL patterns.
     */
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(handler, "/stocks");
    }
}

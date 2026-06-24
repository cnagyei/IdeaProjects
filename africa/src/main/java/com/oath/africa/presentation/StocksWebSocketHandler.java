package com.oath.africa.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class StocksWebSocketHandler extends TextWebSocketHandler {

    // A WebSocketSession manages a single WebSocket connection. It handles the lifecycle of a WebSocket
    // connection, including opening, closing, and maintaining the connection state, and even provides
    // methods to send messages to the client.
    private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();
    private final Map<String, Double> stocks = new ConcurrentHashMap<>();

    public StocksWebSocketHandler() {
        stocks.put("APPLE", 150.0);
        stocks.put("GOOGLE", 2800.0);
        stocks.put("AMAZON", 3300.0);
    }

    private void updateStockPrices() {
        // Randomly update stock prices
        Random random = new Random();
        stocks.forEach( (key, value) -> {
            stocks.put(key, value * (0.95 + random.nextDouble(0.1)));
        });
    }

    /* The TextMessage class symbolizes a text message in a WebSocket connection. It manages text data transfer
    between the WebSocket server and clients.
    */
    private void broadcastUpdatedPrice() throws IOException {
        TextMessage textMessage = new TextMessage(stocks.toString());
        for (WebSocketSession session : sessions) {
            session.sendMessage(textMessage);
        }
    }

    /* Callback methods that get triggered when certain events occur, such as when a new client connects,
    a text message arrives, or the client disconnects:
     */
    public void afterConnectionEstablished(WebSocketSession session) throws IOException {
        this.sessions.add(session);

        // Send current stock prices to new client
        session.sendMessage(new TextMessage(this.stocks.toString()));
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        if ("UPDATE".equals(message.getPayload())) {
            updateStockPrices();
            broadcastUpdatedPrice();
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        sessions.remove(session);
    }
}

package com.example.EventMessagePattern;

import org.springframework.messaging.Message;

public interface EventListenerService<T> {
    void receivedEvent(Message<T> message);
}

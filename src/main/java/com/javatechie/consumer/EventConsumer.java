package com.javatechie.consumer;

import com.javatechie.dto.Book;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    @SqsListener("test-queue")
    public void consumeMessage(@Payload String message) {
        // Process the plain text message
        System.out.println("Received plain text message: " + message);
        // Add your message processing logic here
    }

//    @SqsListener("test-queue")
//    public void consumeBookMessage(@Payload Book book) {
//        // Process the Book object
//        System.out.println("Received book message: " + book);
//        // Add your message processing logic here
//    }
}

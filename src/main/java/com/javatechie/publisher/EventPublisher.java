package com.javatechie.publisher;

import com.javatechie.dto.Book;
import io.awspring.cloud.sqs.operations.SendResult;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    public static final String ENDPOINT_NAME = "";
    @Autowired
    private SqsTemplate sqsTemplate;

    public String publishPlainText(String message) {
        SendResult<String> send = sqsTemplate.send(ENDPOINT_NAME, message);
        return send.messageId().toString();
    }

    public String publishRawObj(Book book) {
        SendResult<Book> send = sqsTemplate.send(ENDPOINT_NAME, book);
        return send.messageId().toString();
    }
}

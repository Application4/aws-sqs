package com.javatechie.controller;

import com.javatechie.dto.Book;
import com.javatechie.publisher.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventPublisher eventPublisher;

    @PostMapping("/publishPlainText/{message}")
    public String publishPlainText(@PathVariable String message) {
        return eventPublisher.publishPlainText(message);
    }

    @PostMapping("/publishRawObj")
    public String publishRawObj(@RequestBody Book book) {
        return eventPublisher.publishRawObj(book);
    }
}

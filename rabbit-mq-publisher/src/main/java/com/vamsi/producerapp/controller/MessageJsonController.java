package com.vamsi.producerapp.controller;

import com.vamsi.producerapp.dto.StuffDto;
import com.vamsi.producerapp.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {

    private RabbitMQJsonProducer jsonProducer;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody StuffDto user){
        jsonProducer.sendJsonMessage(user);
        //System.out.println("Employment Details :"+user.getEmployment().get(0).getCompanyName());
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");
    }
}

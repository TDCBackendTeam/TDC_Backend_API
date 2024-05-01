
package com.vamsi.producerapp.controller;

//import com.vamsi.producerapp.config.MQConfig;
import com.vamsi.producerapp.model.Employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Producer {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("/employee")
    public String SaveEmployee(@RequestBody Employee employee) {
        employee.setEmployeeId(UUID.randomUUID().toString());

//        rabbitTemplate.convertAndSend(MQConfig.TOPICEXCHANGE, MQConfig.employee_route_key, employee);
        return "Employee Saving Success";
    }

}
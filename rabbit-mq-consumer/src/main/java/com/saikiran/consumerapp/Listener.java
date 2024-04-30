package com.saikiran.consumerapp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.saikiran.consumerapp.config.MQConfig;
import com.saikiran.consumerapp.model.Employee;
import com.saikiran.consumerapp.model.Student;

@Component
public class Listener {

    public final static String queue = "employee_queue";

    @RabbitListener(queues = MQConfig.STUDENTQUEUE)
    public void studentListner(Student student) {

        System.out.println("Student Details " + student);

    }

    @RabbitListener(queues = queue)
    public void listner(Employee employee) {
        System.out.println("Employee Details " + employee);
    }

}

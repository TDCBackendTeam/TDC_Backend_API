package com.vamsi.producerapp.controller;

import com.vamsi.producerapp.dto.studentDetailsDto;
import com.vamsi.producerapp.dto.studentDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stuff")
public class studentController {


    @PostMapping("/stuffdetails")
    public studentDetailsDto splitTheObject(@RequestBody studentDto studentDto){
        studentDetailsDto studentDetailsDto = studentDto.getStudent();
        System.out.println(studentDetailsDto.toString());
       return studentDetailsDto;
    }

}

package com.vamsi.producerapp.dto;

import lombok.Data;

import java.util.List;

@Data
public class StuffDto {

     private int staffId;
     private String instituteCode;
      private String   firstName;
      private String        middleName;
      private String lastName;
     private String email;
     private String phone;
     private String alternateContactNo ;
    private String profilePicturePath;
    private String gender;
    private String dateOfBirth;
    private String reportingTo;
    private String isActive;
    private String joiningDate;
    private List<EmploymentDto> employment;
    private List<StaffEducationDto> staffEducations;
    private AddressDto address;
    private DesigDto desig;
    private String  salary;
}


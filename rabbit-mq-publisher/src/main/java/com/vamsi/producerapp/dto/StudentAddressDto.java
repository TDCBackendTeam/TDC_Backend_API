package com.vamsi.producerapp.dto;

import lombok.Data;

@Data
public class StudentAddressDto {
   private String street1;
   private String street2;
   private String city;
   private String state;
   private String pincode;
   private String country;

}

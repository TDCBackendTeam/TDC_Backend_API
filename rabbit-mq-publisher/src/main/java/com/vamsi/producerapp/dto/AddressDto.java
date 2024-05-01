package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private int addId;
    private String street1;
    private String  street2;
    private String  city;
    private String  state;
    private String  pinCode;
    private String  country;
}

package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class contactDto {
    private String emailId;
    private String phoneNo;
    private String altPhoneNo;

}

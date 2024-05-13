package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentDetailsDto {
    private String studentName;
    private String stuTypeId;
    private  StudentAddressDto address;
    private  contactDto contact;
    private String birthday;
    private String createdBy;

}

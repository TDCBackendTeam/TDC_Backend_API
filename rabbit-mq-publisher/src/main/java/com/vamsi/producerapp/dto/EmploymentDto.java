package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentDto {

    private int  staffDetailId;
    private String companyName;
    private String experience;
    private String document;
    private String startDate;
    private String endDate;
    private String uploadDocument;
    private String desig;

}

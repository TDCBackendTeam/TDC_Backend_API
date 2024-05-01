package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffEducationDto {
    private int eduId;
    private String degree;
    private String uploadCertificate;
    private String startDat;
    private String endDate;
    private String division;
    private String mark;
}

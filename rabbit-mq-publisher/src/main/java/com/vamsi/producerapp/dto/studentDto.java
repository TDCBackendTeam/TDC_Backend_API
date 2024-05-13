package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class studentDto {
    private studentDetailsDto student;
    private  int instituteId;
    private  String stageId;
    private  String statusId;
    private  String sourceId;
    private  String allocatedTo;
    private  String createDate;
    private  String remarks;
    private List<leadFolUpDto> leadFolUpDto;

}

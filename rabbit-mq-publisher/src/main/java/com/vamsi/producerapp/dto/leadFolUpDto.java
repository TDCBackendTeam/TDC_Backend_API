package com.vamsi.producerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class leadFolUpDto {
    private  String  leadId;
    private  String  folUpDate;
    private  String  folUpTime;
    private  String  Comments;

}

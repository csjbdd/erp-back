package com.example.erp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDto{
    private Long idx;
    private String title;
    private String contents;
    private String author;
    private String createdAt;
    private int count;
    private int pin;
}

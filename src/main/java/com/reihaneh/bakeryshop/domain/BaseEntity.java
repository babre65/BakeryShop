package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    private LocalDateTime createDate = LocalDateTime.now();
//
//    //TODO: before each update change the value
//    private LocalDateTime updateDate = LocalDateTime.now();
//
//    private String createdBy;
//
//    //TODO: before each update change the value
//    private String updatedBy;
}

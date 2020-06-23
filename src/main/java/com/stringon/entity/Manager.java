package com.stringon.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Manager {
    private String id;
    private Integer age;

    public Manager(String id, Integer age) {
        this.id = id;
        this.age = age;
    }
}


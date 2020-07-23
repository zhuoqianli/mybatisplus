package com.stringon.entity;


import lombok.Data;

public enum CodeEnum {

    SUCCESS(0, "成功");
    Integer code;
    String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}

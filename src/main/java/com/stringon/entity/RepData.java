package com.stringon.entity;

import lombok.Data;

@Data
public class RepData<T> {
    public Integer code;
    public String message;
    public T data;

    public RepData info(Integer code, String message, T data){
        RepData resultData = new RepData();
        resultData.code = code;
        resultData.data = data;
        resultData.message = message;
        return resultData;
    }
    public RepData info(CodeEnum codeEnum,T data) {
        return info(codeEnum.getCode(), codeEnum.getMessage(), data);
    }
}

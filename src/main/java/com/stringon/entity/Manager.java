package com.stringon.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@TableName(autoResultMap = true)
public class Manager implements Serializable {
    @TableId
    private String id;
    private Integer age;
    @TableField(typeHandler = FastjsonTypeHandler.class)
    private Specs specs;

    public Manager(String id, Integer age) {
        this.id = id;
        this.age = age;
    }
}


package com.stringon.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @TableId
    private String id;
    private String name;
    private Double salary;
    private Date birthday;
    private Integer age;
}

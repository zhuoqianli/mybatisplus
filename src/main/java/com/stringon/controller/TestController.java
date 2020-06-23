package com.stringon.controller;

import com.stringon.entity.Manager;
import com.stringon.entity.User;

import java.lang.reflect.Array;
import java.util.*;

public class TestController {
    public static void main(String[] args) {
        Manager manager = new Manager("1", 2);
        String[] s = { "wo", "ai", "ni" };
        String join = String.join("~", s);
        System.out.println(join);
        List<String> objects = Arrays.asList("wo", "hu");
        objects.forEach(p -> {
            if (p.contains("wo"))
            System.out.println(p);
        });
    }
}

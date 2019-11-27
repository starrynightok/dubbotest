package com.dubbo.dubboapi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    String id;
    String name;
    int age;
    String phone;
    String email;
}

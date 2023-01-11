package com.demo.redis.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("students")
public class Student {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Address address;

}

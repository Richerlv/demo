package com.example.demo.pojo;

import org.springframework.stereotype.Component;

/**
 * @author: Richerlv
 * @date: 2023/7/23 23:50
 * @description:
 */
@Component
public class Order {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

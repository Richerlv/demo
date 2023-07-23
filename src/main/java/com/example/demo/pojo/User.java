package com.example.demo.pojo;
import org.springframework.stereotype.Component;

/**
 * @author: Richerlv
 * @date: 2023/7/23 16:05
 * @description:
 */

@Component
public class User {

    private int id;

    private String name;

    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

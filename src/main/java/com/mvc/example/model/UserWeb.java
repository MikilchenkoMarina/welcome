package com.mvc.example.model;

/**
 * Created by mmikilchenko on 02.12.2016.
 */
import org.springframework.stereotype.Component;


@Component
public class UserWeb {

    private String name;
    private String password;

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

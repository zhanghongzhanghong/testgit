package com.zhang.spring.springbootweb.vo;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class User  implements Serializable {

    private  String id;

    @NotBlank(message = "用户名不能为空")
    private  String name;

    private  int age;

    public User() {
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

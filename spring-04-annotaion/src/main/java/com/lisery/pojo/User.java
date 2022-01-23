package com.lisery.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.lisery.pojo.User"/>
@Component
@Scope("singleton")
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("lisery")
    public void setName(String name) {
        this.name = name;
    }
}

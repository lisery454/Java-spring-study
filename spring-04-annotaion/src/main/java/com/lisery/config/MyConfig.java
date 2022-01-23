package com.lisery.config;


import com.lisery.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lisery.pojo")
public class MyConfig {
    @Bean
    public User getUser() {
        return new User();
    }

}

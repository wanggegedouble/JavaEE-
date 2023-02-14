package com.wy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanConfig {
    @Bean("hello")
    String  hello(){
        return "word";
    }
}

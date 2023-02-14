package com.wy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wy")
public class SpringConfig {

    /*@Bean("realDataRedisTemplate")
    public StringRedisTemplate getNowRedisTemplate(RedisConnectionFactory connectionFactory) {
        StringRedisTemplate redisTemplate = new StringRedisTemplate();
        redisTemplate.setConnectionFactory(getDbConnectionFactory(connectionFactory, realDataDb));
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }*/
}

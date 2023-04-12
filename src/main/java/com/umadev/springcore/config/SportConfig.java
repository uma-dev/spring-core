package com.umadev.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.umadev.springcore.common.Coach;
import com.umadev.springcore.common.SwimCoach;

@Configuration
public class SportConfig {
    @Bean
    //Bean ID defaults to method name (class name with initial lower case)
    // use @Bean("customName") and make sure to use same name in Qualifier
    public Coach swimCoach() { 
        return new SwimCoach();
    }

}

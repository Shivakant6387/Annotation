package com.example.Test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddConfiguration {
    @Bean
    BabyHealthProvider getBabyHealthProvider(){

        return new BabyHealthProvider();
    }
}

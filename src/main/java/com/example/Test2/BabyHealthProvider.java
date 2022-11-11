package com.example.Test2;

import org.springframework.context.annotation.Bean;

public class BabyHealthProvider {
    @Bean
    BabyHealthProvider getBabyHealthProvider(){
        return new BabyHealthProvider();
    }
}

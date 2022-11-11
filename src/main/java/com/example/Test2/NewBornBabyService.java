package com.example.Test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewBornBabyService {

    @Autowired
    BabyHealthProvider babyHealthProvider;
public String getBabyName(){
    return "Shiva";
}
public Baby getBaby(){
    Baby baby=new Baby();
    baby.setName("Biju");
    baby.setWeight(2.6);
    return baby;
}
}

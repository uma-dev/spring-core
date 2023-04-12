package com.umadev.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    //Verify that by default the Beam is initialized even if isn't required
    public CricketCoach(){
        System.out.println("In class: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
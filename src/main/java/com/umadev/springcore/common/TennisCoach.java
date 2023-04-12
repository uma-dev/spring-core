package com.umadev.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    //Verify that by default the Beam is initialized even if isn't required
    public TennisCoach(){
        System.out.println("In class: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}

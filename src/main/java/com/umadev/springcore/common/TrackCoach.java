package com.umadev.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    //Verify that by default the Beam is initialized even if isn't required
    public TrackCoach(){
        System.out.println("In class: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }
}

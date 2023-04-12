package com.umadev.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umadev.springcore.common.Coach;

@RestController
public class MyController {
    // Define a private field for the coach
    private Coach myCoach; 

    // Constructor injection RECOMMENDED
    // Define the constructor for dependency injection 
    /*@Autowired
    public MyController(Coach theCoach){
        myCoach = theCoach;
    }
    */

    // Setter injection
    @Autowired
    public void setCoach(Coach theCoach){ //setter name doesn't matter, autowired makes the magic
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}

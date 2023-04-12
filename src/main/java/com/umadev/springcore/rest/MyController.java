package com.umadev.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umadev.springcore.common.Coach;

@RestController
public class MyController {
    // Define a private field for the coach
    private Coach myCoach; 

    // Constructor injection RECOMMENDED
    // Define the constructor for dependency injection 
    // @Qualifier also recommended above @Primary annotation on the beam
    @Autowired
    public MyController( @Qualifier("swimCoach") Coach theCoach){
        System.out.println("In class: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    // Field injection - NOT RECOMMENDED
    /* No need to add constructors or setters but makes code 
       harder to unit test.
     @Autowired
     private Coach myCoach 
    */

    // Setter injection
    /*@Autowired
    public void setCoach(Coach theCoach){ //setter name doesn't matter, autowired makes the magic
        myCoach = theCoach;
    }
    */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}

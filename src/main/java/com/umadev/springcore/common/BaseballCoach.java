package com.umadev.springcore.common;

import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //if you want a different scope
// @Primary // Use this annotation instead of Qualifier in constructor 
//(controller), keep in mind that has less priority than Qualifier
public class BaseballCoach implements Coach{

    //Verify that by default the Beam is initialized even if isn't required
    public BaseballCoach(){
        System.out.println("In class: " + getClass().getSimpleName());
    }

    // Define init method
    /*
    @PostConstruct
    public void doMyStartup(){
        System.out.println("In doMyStartup()");
    }

    // Define destroy method
    @PreDestroy
    public void doMyCleanup(){
        System.out.println("In doMyCleanup()");
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}

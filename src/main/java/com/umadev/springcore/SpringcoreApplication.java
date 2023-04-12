package com.umadev.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* In case you Beans are not in the same folder as main application
@SpringBootApplication(
	scanBasePackages = { 	
			"com.umadev.springcore",
			"com.somepackage"
	}
)
*/

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}  

package com.firstProject.springBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {
        //Application context manages all the beans
        //The run method returns application context object
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

        int result = binarySearch.searchNumber(new int[]{2,6,3, 8}, 3);
        if (result != -1) {
            System.out.println("element is present in sorted array at index = " + result);
        } else {
            System.out.println("element is not present");
        }
    }
}

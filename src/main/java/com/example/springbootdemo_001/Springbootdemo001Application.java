package com.example.springbootdemo_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootdemo001Application {

    public static void main(String[] args) {
        try{
            SpringApplication.run(Springbootdemo001Application.class, args);
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }

    }

}

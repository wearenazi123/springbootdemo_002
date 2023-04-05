package com.example.springbootdemo_001;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String args[]){
        List<String>  list =new ArrayList<>();
        list.add("ss");
        list.forEach(System.out::println);
    }
}

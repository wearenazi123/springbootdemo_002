package com.example.springbootdemo_001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lambda {
    public static void main(String args[]){
        List<String>  list =new ArrayList<>();
        list.add("ss");
        list.forEach(System.out::println);
        new Random(47).ints(5,20).distinct()
                .limit(7).sorted().forEach(System.out::println);
    }
}

package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.java2d.Surface;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String na = "Hello, %s!";
    private static final String template = "I am %s years old!";
    private static final String ye = "My surname is %s";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "age", defaultValue = "21") String age){
        return new Greeting(counter.incrementAndGet(), String.format(na, name), String.format(template, age));
    }

    @GetMapping("/greeting/{surname}")
    public String getString(){
        return "Mans uzvards ir Lejnieks";
    }

    @GetMapping("/list")
    public List<Greeting> getObject(){
        List<Greeting> itemList = Arrays.asList(
                new Greeting(1, "Janis", "27"),
                new Greeting(2, "Roberts", "23"));
                return itemList;

    }

}

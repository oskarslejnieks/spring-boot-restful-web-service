package com.example.spring;

public class Greeting {
    private final long id;
    private final String name;
    private final String age;


    public Greeting(long id,String name ,String age ){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }

}

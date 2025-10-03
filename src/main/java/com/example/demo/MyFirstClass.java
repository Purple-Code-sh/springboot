package com.example.demo;

public class MyFirstClass {

    private final String myVar;

    public MyFirstClass(String myVarParameter){
        this.myVar = myVarParameter;
    }

    public String sayHello(){
        return "MyFirstClass is saying => myVar: " + myVar;
    }
}

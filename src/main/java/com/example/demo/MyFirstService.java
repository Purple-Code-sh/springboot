package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private final MyFirstClass myFirstClass;
    private Environment enviromentObject;


    public MyFirstService(
            @Qualifier("bean2") MyFirstClass myFirstClass
    ){
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
        return  "the dependency obtained this: " + myFirstClass.sayHello();
    }

    @Autowired
    public void setEnviromentObject(Environment  environment){
        this.enviromentObject = environment;
    }

    public String getJavaVersion(){
        String version = enviromentObject.getProperty("java.version");
        return "La version que tienes de java es: " + version;
    }

    public String getOSName(){
        String osname = enviromentObject.getProperty("os.name");
        return "Tu sistema operativo es: " + osname;
    }

}

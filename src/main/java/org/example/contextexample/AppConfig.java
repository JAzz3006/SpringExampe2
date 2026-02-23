package org.example.contextexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example.contextexample")
public class AppConfig {

    @Bean
    public LogicClass simpleLogicClass(){
        return new LogicClass();
    }

    @Bean
    public LogicClass logicClassData(){
        return new LogicClass("Logic class", 42);
    }
}

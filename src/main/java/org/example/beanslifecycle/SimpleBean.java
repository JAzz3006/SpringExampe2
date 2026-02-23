package org.example.beanslifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SimpleBean {

    public SimpleBean(){
        System.out.println("SimpleBean created");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("SimpleBean calling afterInit");
    }
}

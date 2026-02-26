package org.example.c_beanscopes;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Lazy
public class SecondSingleton {

    private Instant createdTime;
    private final PrototypeComponent prototypeComponent;

    public SecondSingleton(PrototypeComponent prototypeComponent){
        System.out.println("SecondSingleton created ");
        createdTime = Instant.now();
        printCreatedTime();
        this.prototypeComponent = prototypeComponent;
        prototypeComponent.printCreatedTime();
    }

    public void printCreatedTime(){
        System.out.println("SecondSingleton created at: " + createdTime);
    }
}

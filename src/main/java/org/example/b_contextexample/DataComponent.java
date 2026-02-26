package org.example.b_contextexample;
import org.springframework.stereotype.Component;

@Component
public class DataComponent {
    public DataComponent(){
        System.out.println("DataComponent initialized");
    }

    public void someWork(){
        System.out.println("Some component work");
    }
}

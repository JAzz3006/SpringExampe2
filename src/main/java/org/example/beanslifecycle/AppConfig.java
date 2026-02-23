package org.example.beanslifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example.beanslifecycle")
public class AppConfig {

   @Bean(initMethod = "afterInit", destroyMethod = "beforeDestroy")
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }
}


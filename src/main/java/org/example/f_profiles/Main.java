package org.example.f_profiles;
import org.example.f_profiles.config.DefaultAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DefaultAppConfig.class);

        context.getBean(ProfileWorker.class).doWork();
    }
}

package org.example.f_profiles.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("org.example.profiles")
@Configuration
@PropertySource("classpath:application.properties")

public class DefaultAppConfig {
}

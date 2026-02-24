package org.example.profiles.config;
import org.example.profiles.EnvPrinter;
import org.example.profiles.TestEnvPrinter;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources(
        value = {
                @PropertySource("classpath:application-test.properties")
        }
)
@Profile("test")
public class TestAppConfig {

    @Bean
    public EnvPrinter envPrinter(){
        return new TestEnvPrinter();
    }

}


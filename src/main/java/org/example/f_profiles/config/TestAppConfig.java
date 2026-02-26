package org.example.f_profiles.config;
import org.example.f_profiles.EnvPrinter;
import org.example.f_profiles.TestEnvPrinter;
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


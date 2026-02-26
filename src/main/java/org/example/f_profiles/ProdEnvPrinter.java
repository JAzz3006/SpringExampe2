package org.example.f_profiles;
import org.springframework.beans.factory.annotation.Value;

public class ProdEnvPrinter implements EnvPrinter{

    @Value("${app.env}")
    private String env;

    @Override
    public void printEnv() {
        System.out.println("ProdEnvPrinter calling");
        System.out.println("ProdEnvPrinter env is: " + env);
    }
}

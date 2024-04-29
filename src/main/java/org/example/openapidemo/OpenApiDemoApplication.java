package org.example.openapidemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class OpenApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenApiDemoApplication.class, args);
    }

}

package com.example.barcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BarCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarCodeApplication.class, args);
    }

}

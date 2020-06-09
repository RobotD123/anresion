package com.anresion.operation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages
                       = {"com.anresion.operation",
                        "com.anresion.repository",


})
public class ErpOperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpOperationApplication.class, args);
    }
}

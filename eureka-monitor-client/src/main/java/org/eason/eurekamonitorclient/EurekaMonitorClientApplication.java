package org.eason.eurekamonitorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class EurekaMonitorClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMonitorClientApplication.class, args);
    }
}

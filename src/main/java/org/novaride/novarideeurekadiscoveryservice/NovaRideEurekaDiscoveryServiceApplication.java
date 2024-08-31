package org.novaride.novarideeurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NovaRideEurekaDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovaRideEurekaDiscoveryServiceApplication.class, args);
    }

}

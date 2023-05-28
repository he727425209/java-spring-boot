package com.learning.config;

import com.learning.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean(value = "hondaVehicle")
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean("ferariVehicle")
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferari");
        return vehicle;
    }
}

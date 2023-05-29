package com.learning.config;

import com.learning.beans.Person;
import com.learning.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.learning.beans")
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean
    @Primary
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }
}

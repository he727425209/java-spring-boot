package com.learning.config;

import com.learning.beans.Person;
import com.learning.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    Person person() {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle());
        return person;
    }
}

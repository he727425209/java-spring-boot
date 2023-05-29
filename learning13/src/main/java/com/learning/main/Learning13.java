package com.learning.main;

import com.learning.beans.Person;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learning13 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class); // vehicle should be created first then person
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
        person.getVehicle().getVehicleServices().getSpeakers().makeSound();
        person.getVehicle().getVehicleServices().getTyres().makeMove();

    }
}

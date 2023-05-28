package com.learning.main;

import com.learning.beans.Vehicle;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learning3 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("ferariVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());

    }
}

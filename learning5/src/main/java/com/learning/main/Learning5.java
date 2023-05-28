package com.learning.main;

import com.learning.beans.Vehicle;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learning5 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName()); // should print null
        veh1.printHello();
    }
}

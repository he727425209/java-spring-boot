package com.learning.main;

import com.learning.config.ProjectConfig;
import com.learning.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learning16 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("The hashcode for vehicleServices1 is " + vehicleServices1.hashCode());
        System.out.println("The hashcode for vehicleServices2 is " + vehicleServices2.hashCode());
        if (vehicleServices1 == vehicleServices2) {
            System.out.println("The two are the same");
        } else {
            System.out.println("The two are different");
        }
    }
}

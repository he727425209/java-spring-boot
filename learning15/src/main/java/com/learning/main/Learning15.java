package com.learning.main;

import com.learning.beans.Person;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learning15 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("This is before person bean being retrieved");
        Person person = context.getBean(Person.class);
        System.out.println("This is after person bean being retrieved");
    }
}

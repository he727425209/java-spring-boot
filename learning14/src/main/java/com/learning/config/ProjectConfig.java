package com.learning.config;

import com.learning.beans.*;
import com.learning.interfaces.Speakers;
import com.learning.interfaces.Tyres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.learning.implementation",
        "com.learning.services"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
public class ProjectConfig {

}
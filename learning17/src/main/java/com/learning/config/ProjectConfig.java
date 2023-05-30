package com.learning.config;

import com.learning.beans.*;
import com.learning.interfaces.Speakers;
import com.learning.interfaces.Tyres;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.learning.implementation",
        "com.learning.services", "com.learning.aspects"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
package com.learning.config;

import com.learning.beans.*;
import com.learning.interfaces.Speakers;
import com.learning.interfaces.Tyres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.learning.beans")
public class ProjectConfig {
    @Bean
    Speakers sonySpeakers() {
        Speakers sonySpeakers = new SonySpeakers();
        return sonySpeakers;
    }

    @Bean
    Speakers boseSpeakers() {
        Speakers boseSpeakers = new BoseSpeakers();
        return boseSpeakers;
    }

    @Bean
    Tyres michelinTyres() {
        Tyres michelinTyres = new MichelinTyres();
        return michelinTyres;
    }

    @Bean
    Tyres bridgeStoneTyres() {
        Tyres bridgeStoneTyres = new BridgeStoneTyres();
        return bridgeStoneTyres;
    }
}

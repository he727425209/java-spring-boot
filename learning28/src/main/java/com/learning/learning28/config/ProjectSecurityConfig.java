package com.learning.learning28.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests((requests) -> {
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("", "/", "/home")).permitAll();
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("/holidays/**")).permitAll();
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("/contact")).permitAll();
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("/saveMsg")).permitAll();
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("/courses")).permitAll() ;
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("/about")).permitAll();
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.requestMatchers("/assets/**")).permitAll();
        });
//        http.authorizeHttpRequests((requests) -> {
//            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).denyAll();
//        });
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

package com.hustler.post.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsFilter implements WebMvcConfigurer {
    @Value("${app.cors.allowedOrigins}")
    private String[] allowedOrigins;
    @Value("${app.cors.allowedMethods}")
    private String[] allowedMethods;
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedOrigins(allowedOrigins)
                .allowedHeaders("*")
                .allowedMethods(allowedMethods)
                .allowCredentials(true);
    }
}

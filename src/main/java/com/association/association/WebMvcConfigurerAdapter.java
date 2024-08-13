package com.association.association;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public abstract class WebMvcConfigurerAdapter implements WebMvcConfigurer {
    public abstract void addCorsMappings(CorsRegistry registry);
}

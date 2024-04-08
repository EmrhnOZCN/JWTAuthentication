package com.example.springsecuritydemo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/admin_only")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET") // Sadece GET isteklerine izin vermek için
                .allowedHeaders("*"); // Tüm başlıklara izin vermek için
    }
}

package com.prgrossman.musicapi.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LoggerConfig {

    //InjectionPoint is a Spring framework utility that
    // provides metadata about where the bean is being injected.
    //
    // Here, it allows you to determine which class is requesting the logger.
    //
    //injectionPoint.getMember().getDeclaringClass() gets the class where the logger
    // is being injected, which you then pass to the logger factory.

    @Bean
    @Scope(value = "prototype")
    public Logger logger(InjectionPoint injectionPoint){
        Class<?> classCallingBeanMethodForInjection = injectionPoint.getMember().getDeclaringClass();
        return LoggerFactory.getLogger(classCallingBeanMethodForInjection);
    }

}

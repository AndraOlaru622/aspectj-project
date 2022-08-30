package com.example.demospring.aspects;

import com.example.demospring.aspects.interceptors.ControllerInterceptorAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect StartApplicationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerInterceptorAspect.class);

    pointcut repositoryLoggingPoint() : execution(* com.example.demospring.DemoSpringApplication.main(..));

    before() : repositoryLoggingPoint() {
        LOGGER.info("Starting Application");
    }

    after() : repositoryLoggingPoint() {
        LOGGER.info("Application Started");
    }
}

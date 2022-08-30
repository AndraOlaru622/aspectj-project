package com.example.demospring.aspects.interceptors;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect ControllerInterceptorAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerInterceptorAspect.class);

    pointcut controllerLoggingPoint() : execution(* com.example.demospring.controller.*.*(..));

    before() : controllerLoggingPoint() {
        String[] operationSignature = (thisJoinPoint.getSignature().toString()).split("\\.", 10);
        LOGGER.info("Before Controller: " + operationSignature[operationSignature.length - 2]);
    }

    after() : controllerLoggingPoint() {
        String[] operationSignature = (thisJoinPoint.getSignature().toString()).split("\\.", 10);
        LOGGER.info("After Controller: " + operationSignature[operationSignature.length - 2]);
    }

}

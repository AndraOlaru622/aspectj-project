package com.example.demospring.aspects.interceptors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect ServiceInterceptorAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceInterceptorAspect.class);

    pointcut serviceLoggingPoint() : execution(* com.example.demospring.service.*.*(..));

    before() : serviceLoggingPoint() {
        String[] operationSignature = (thisJoinPoint.getSignature().toString()).split("\\.", 10);
        LOGGER.info("Before Service: " + operationSignature[operationSignature.length - 2]);
    }

    after() : serviceLoggingPoint() {
        String[] operationSignature = (thisJoinPoint.getSignature().toString()).split("\\.", 10);
        LOGGER.info("After Service: " + operationSignature[operationSignature.length - 2]);
    }

}

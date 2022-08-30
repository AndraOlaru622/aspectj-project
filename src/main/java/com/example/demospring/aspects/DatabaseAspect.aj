package com.example.demospring.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect DatabaseAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseAspect.class);

    pointcut anyGetPutPostDeleteMappingMethodPointCut() : execution(* com.example.demospring.service.DriverService.*(..)) && @annotation(org.springframework.web.bind.annotation.PostMapping) ||
            @annotation(org.springframework.web.bind.annotation.PutMapping) ||
            @annotation(org.springframework.web.bind.annotation.DeleteMapping) ||
            @annotation(org.springframework.web.bind.annotation.GetMapping);

    pointcut anyRequestMappingMethodPointCut() : execution(* *(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping);

    after() returning : anyGetPutPostDeleteMappingMethodPointCut() ||anyRequestMappingMethodPointCut() {
        LOGGER.info("****Database Operation");

        String[] operationSignature = (thisJoinPoint.getSignature().toString()).split("\\.", 10);
        String callerFunction = operationSignature[operationSignature.length - 1];
        String callerController = operationSignature[operationSignature.length - 2];

        if(callerController.equals("BasicErrorController")) {
            LOGGER.info("*****Database Operation Error ");
        } else {
            LOGGER.info("*****Caller Controller: " + callerController);
            LOGGER.info("*****Caller Function: " + callerFunction);
        }
    }

}

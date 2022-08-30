package com.example.demospring.aspects;

import com.example.demospring.model.Driver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect AddToDatabaseAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddToDatabaseAspect.class);

    pointcut databaseLoggingPoint() : execution(* com.example.demospring.controller.DriverController.addDriver(..));

    before() : databaseLoggingPoint() {
        Object[] signatureArgs = thisJoinPoint.getArgs();
        for (Object signatureArg: signatureArgs) {
            Driver dr = (Driver) signatureArg;
            LOGGER.info("First Name: " + dr.getFirst_name());
            LOGGER.info("Last Name: " + dr.getLast_name());
            LOGGER.info("Id: " + dr.getId());
            LOGGER.info("Salary: " + dr.getSalary());
            LOGGER.info("Age: " + dr.getAge());
            LOGGER.info("Year of employment: " + dr.getYear_employment());
        }
    }

}

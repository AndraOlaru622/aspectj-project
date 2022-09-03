package com.example.demospring.aspects;

import com.example.demospring.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect AddToDatabaseAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddToDatabaseAspect.class);

    pointcut databaseLoggingPointDriver() : execution(* com.example.demospring.controller.DriverController.addDriver(..));
    pointcut databaseLoggingPointLine() : execution(* com.example.demospring.controller.LineController.addLine(..));
    pointcut databaseLoggingPointLocation() : execution(* com.example.demospring.controller.LocationController.addLocation(..));
    pointcut databaseLoggingPointPrice() : execution(* com.example.demospring.controller.PriceController.addPrice(..));
    pointcut databaseLoggingPointVehicle() : execution(* com.example.demospring.controller.VehicleController.addVehicle(..));

    before() : databaseLoggingPointDriver() {
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

    before() : databaseLoggingPointLine() {
        Object[] signatureArgs = thisJoinPoint.getArgs();
        for (Object signatureArg: signatureArgs) {
            Line line = (Line) signatureArg;
            LOGGER.info("Id: " + line.getId());
            LOGGER.info("Departure: " + line.getDeparture());
            LOGGER.info("Type: " + line.getType());
            LOGGER.info("Destination: " + line.getDestination());
        }
    }

    before() : databaseLoggingPointLocation() {
        Object[] signatureArgs = thisJoinPoint.getArgs();
        for (Object signatureArg: signatureArgs) {
            Location location = (Location) signatureArg;
            LOGGER.info("Id: " + location.getId());
            LOGGER.info("City: " + location.getCity());
            LOGGER.info("Country: " + location.getCountry());
        }
    }

    before() : databaseLoggingPointLocation() {
        Object[] signatureArgs = thisJoinPoint.getArgs();
        for (Object signatureArg: signatureArgs) {
            Price price = (Price) signatureArg;
            LOGGER.info("Id: " + price.getId());
            LOGGER.info("Price: " + price.getPrice());
            LOGGER.info("Currency: " + price.getCurrency());
            LOGGER.info("Id Line: " + price.getIdLine());
        }
    }

    before() : databaseLoggingPointLocation() {
        Object[] signatureArgs = thisJoinPoint.getArgs();
        for (Object signatureArg: signatureArgs) {
            Vehicle vehicle = (Vehicle) signatureArg;
            LOGGER.info("Id: " + vehicle.getId());
            LOGGER.info("Brand: " + vehicle.getBrand());
            LOGGER.info("Service condition: " + vehicle.getServiceCondition());
        }
    }

}

package com.example.demo.querys;

public class Querys {
    public final static String GET_DRIVERS_SQL = "select * from drivers";
    public final static String ADD_DRIVER ="INSERT INTO drivers(id,first_name, last_name, age, year_employment, salary, idLocation) values (null,?,?,?,?,?,?)";
    public final static String DELETE_DRIVER ="DELETE FROM drivers where id = ?";
    public final static String UPDATE_DRIVER= "UPDATE drivers SET first_name = ?, last_name = ?, age = ?, year_employment = ?, salary = ?, idLocation = ? where (id = ?);";

//    Queries for vehicles

    public final static String GET_VEHICLES_SQL = "select * from vehicles";
    public final static String ADD_VEHICLE ="INSERT INTO vehicles(id, idDriver, idLine, brand, year, service_condition) values (null,?,?,?,?,?)";
    public final static String DELETE_VEHICLE ="DELETE FROM vehicles where id = ?";

    //    Queries for lines

    public final static String GET_LINES_SQL = "select * from connections";
    public final static String ADD_LINE ="INSERT INTO connections(id, departure, destination, type, duration) values (null,?,?,?,?)";
    public final static String DELETE_LINE ="DELETE FROM connections where id = ?";

    //    Queries for locations

    public final static String GET_LOCATIONS_SQL = "select * from locations";
    public final static String ADD_LOCATION ="INSERT INTO locations(id, city, country) values (null,?,?)";
    public final static String DELETE_LOCATION ="DELETE FROM locations where id = ?";

    //    Queries for prices

    public final static String GET_PRICES_SQL = "select * from prices";
    public final static String ADD_PRICE ="INSERT INTO prices(id, idLine, price, currency) values (null,?,?,?)";
    public final static String DELETE_PRICE ="DELETE FROM prices where id = ?";

    //    Queries for main commands

    public final static String DRIVERS_LOCATION =   "select d.id, d.first_name, d.last_name, l.city, l.country " +
                                                    "from javaProject.drivers d join javaProject.locations l \n" +
                                                    "on d.idLocation = l.id";

    public final static String DRIVERS_VEHICLE =   "select d.id, d.first_name, d.last_name, v.brand, v.service_condition " +
                                                    "from javaProject.drivers d join javaProject.vehicles v \n" +
                                                    "on d.id = v.idDriver";

    public final static String VEHICLES_LINE =  "select v.id, v.idDriver, v.brand, v.service_condition, c.departure, c.destination, c.type, c.duration " +
                                                "from javaProject.connections c left join javaProject.vehicles v \n" +
                                                "on c.id = v.idLine";

    public final static String LINES_PRICE =    "select c.id, c.departure, c.destination, c.duration, p.price, p.currency " +
                                                "from javaProject.connections c join javaProject.prices p \n" +
                                                "on c.id = p.idLine";

    //    Query for logger

    public final static String ADD_ACTION ="INSERT INTO logger(id, message, time) values (null,?,?)";
}

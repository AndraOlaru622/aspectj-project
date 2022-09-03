package com.example.demospring.repository;

import com.example.demo.querys.Querys;
import com.example.demospring.model.DriverLocation;
import com.example.demospring.model.DriverVehicle;
import com.example.demospring.model.LinePrice;
import com.example.demospring.model.VehicleLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class MainRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(MainRepository.class);

    public List<DriverLocation> getDriverLocations() {
        List<DriverLocation> driver_locations = jdbcTemplate.query(Querys.DRIVERS_LOCATION, (resultSet, i) ->  new DriverLocation(
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("city"),
                resultSet.getString("country")

        ));
        // LOGGER.info("Retrieving driver's locations ... {}", driver_locations);
        jdbcTemplate.update(Querys.ADD_ACTION, "Retrieving driver's locations from database", LocalDate.now());
        return driver_locations;
    }

    public List<DriverVehicle> getDriverVehicles() {
        List<DriverVehicle> driver_vehicles = jdbcTemplate.query(Querys.DRIVERS_VEHICLE, (resultSet, i) ->  new DriverVehicle(
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("brand"),
                resultSet.getString("service_condition")

        ));
        // LOGGER.info("Retrieving driver's vehicles ... {}", driver_vehicles);
        jdbcTemplate.update(Querys.ADD_ACTION, "Retrieving driver's vehicles from database", LocalDate.now());
        return driver_vehicles;
    }

    public List<VehicleLine> getVehicleLines() {
        List<VehicleLine> vehicle_lines = jdbcTemplate.query(Querys.VEHICLES_LINE, (resultSet, i) ->  new VehicleLine(
                resultSet.getInt("id"),
                resultSet.getInt("idDriver"),
                resultSet.getString("brand"),
                resultSet.getString("service_condition"),
                resultSet.getString("departure"),
                resultSet.getString("destination"),
                resultSet.getString("type"),
                resultSet.getInt("duration")

        ));
        // LOGGER.info("Retrieving vehicle's lines ... {}", vehicle_lines);
        jdbcTemplate.update(Querys.ADD_ACTION, "Retrieving vehicle's line from database", LocalDate.now());
        return vehicle_lines;
    }

    public List<LinePrice> getLinesPrice() {
        List<LinePrice> lines_price = jdbcTemplate.query(Querys.LINES_PRICE, (resultSet, i) ->  new LinePrice(
                resultSet.getInt("id"),
                resultSet.getString("departure"),
                resultSet.getString("destination"),
                resultSet.getInt("duration"),
                resultSet.getDouble("price"),
                resultSet.getString("currency")

        ));
        // LOGGER.info("Retrieving line's price ... {}", lines_price);
        jdbcTemplate.update(Querys.ADD_ACTION, "Retrieving line's price from database", LocalDate.now());
        return lines_price;
    }
}

package com.example.demospring.repository;

import com.example.demo.querys.Querys;
import com.example.demospring.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class LocationRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationRepository.class);

    public List<Location> getLocations() {
        List<Location> locations = jdbcTemplate.query(Querys.GET_LOCATIONS_SQL, (resultSet, i) ->  new Location(
                resultSet.getInt("id"),
                resultSet.getString("city"),
                resultSet.getString("country")

        ));
        // LOGGER.info("Retrieving locations ... {}", locations);
        jdbcTemplate.update(Querys.ADD_ACTION, "Retrieving locations from database", LocalDate.now());
        return locations;
    }

    public List<Location> addLocation(Location p) {
        jdbcTemplate.update(Querys.ADD_LOCATION, p.getCity(), p.getCountry());
        return getLocations();
    }

    public List<Location> deleteLocationById(int id) {
        jdbcTemplate.update(Querys.DELETE_LOCATION,id);
        return getLocations();
    }
}

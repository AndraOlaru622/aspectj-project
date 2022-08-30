package com.example.demospring.repository;

import com.example.demo.querys.Querys;
import com.example.demospring.model.Price;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class PriceRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceRepository.class);

    public List<Price> getPrices() {
        List<Price> prices = jdbcTemplate.query(Querys.GET_PRICES_SQL, (resultSet, i) ->  new Price(
                resultSet.getInt("id"),
                resultSet.getInt("idLine"),
                resultSet.getDouble("price"),
                resultSet.getString("currency")

        ));
        LOGGER.info("Retrieving prices ... {}", prices);
        jdbcTemplate.update(Querys.ADD_ACTION, "Retrieving prices from database", LocalDate.now());
        return prices;
    }

    public List<Price> addPrice(Price p) {
        jdbcTemplate.update(Querys.ADD_PRICE, p.getIdLine(), p.getPrice(), p.getCurrency());
        return getPrices();
    }

    public List<Price> deletePriceById(int id) {
        jdbcTemplate.update(Querys.DELETE_PRICE,id);
        return getPrices();
    }
}

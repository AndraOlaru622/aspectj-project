package com.example.demospring.controller;

import com.example.demospring.model.Price;
import com.example.demospring.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/prices")
public class PriceController {
    @Autowired
    private PriceService priceService;


    @GetMapping("/get")
    public List<Price> getPricens() {
        return priceService.getPrices();
    }

    @PostMapping("/add")
    public List<Price> addPrice(@RequestBody @Valid Price p) {
        return priceService.addPrice(p);
    }

    @DeleteMapping("/delete")
    public List<Price> deletePriceById(@RequestParam int id) {
        return priceService.deletePriceById(id);
    }
}

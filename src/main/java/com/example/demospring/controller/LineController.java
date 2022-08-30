package com.example.demospring.controller;

import com.example.demospring.model.Line;
import com.example.demospring.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lines")
public class LineController {

    @Autowired
    private LineService lineService;


    @GetMapping("/get")
    public List<Line> getLines() {
        return lineService.getLines();
    }

    @PostMapping("/add")
    public List<Line> addLine(@RequestBody @Valid Line p) {
        return lineService.addLine(p);
    }

    @DeleteMapping("/delete")
    public List<Line> deleteLineById(@RequestParam int id) {
        return lineService.deleteLineById(id);
    }
}

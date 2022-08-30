package com.example.demospring.service;


import com.example.demospring.model.Line;
import com.example.demospring.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineService {

    @Autowired
    private LineRepository lineRepository;


    public List<Line> getLines() {
        return lineRepository.getLines();
    }

    public List<Line> addLine(Line p) {
        return lineRepository.addLine(p);
    }

    public List<Line> deleteLineById(int id) {
        return lineRepository.deleteLineById(id);
    }
}

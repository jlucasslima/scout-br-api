package com.scoutbr.api.controllers;

import com.scoutbr.api.models.Time;
import com.scoutbr.api.repositories.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times") 
public class TimeController {

    @Autowired
    private TimeRepository timeRepository;

    @GetMapping
    public List<Time> listarTodos() {
        return timeRepository.findAll();
    }

    @PostMapping
    public Time cadastrarTime(@RequestBody Time novoTime) {
        return timeRepository.save(novoTime);
    }
}
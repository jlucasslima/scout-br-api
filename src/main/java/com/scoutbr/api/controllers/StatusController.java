package com.scoutbr.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    
    @GetMapping("/status")
    public String checarStatus() {
        return "API ScoutBR rodando 100%! Vai Corinthians!";
    }
}

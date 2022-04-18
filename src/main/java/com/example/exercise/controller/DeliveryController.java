package com.example.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/consegna")
@CrossOrigin(origins = "http://localhost:3000")
public class ConsegnaController {

    @Autowired
    ConsegnaService consegnaService;

    @GetMapping(path = "/{id}")
    ResponseEntity<Consegna> findById(@PathVariable String id) {
        Optional<Consegna> consegna = consegnaService.findById(id);
        return new ResponseEntity<Consegna>((Consegna) consegnaService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(consegnaService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Consegna> saveOne(@RequestBody Consegna consegna) {
        Consegna consegna1 = consegnaService.saveOne(consegna);
        return new ResponseEntity<>(consegna1, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteOne(@PathVariable String id) {
        consegnaService.deleteOne(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

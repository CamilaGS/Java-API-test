package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value = "/", method = { RequestMethod.GET })
    public ResponseEntity<String> getTeste() {
        return ResponseEntity.status(HttpStatus.CREATED).body("teste");
    }
    @RequestMapping(value = "/", method = { RequestMethod.PUT })
    public ResponseEntity<String> getTeste2() {
        return ResponseEntity.status(HttpStatus.CREATED).body("teste2");
    }
}
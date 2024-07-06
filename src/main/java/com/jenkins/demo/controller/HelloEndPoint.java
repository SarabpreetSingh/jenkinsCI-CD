package com.jenkins.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloEndPoint {

    @GetMapping("/get/{name}")
    ResponseEntity<String> hello(@PathVariable String name){
        return ResponseEntity.ok(name);
    }

    @GetMapping("/get")
    ResponseEntity<String> helloWorld(@RequestParam String name){
        return ResponseEntity.ok(name);
    }


}

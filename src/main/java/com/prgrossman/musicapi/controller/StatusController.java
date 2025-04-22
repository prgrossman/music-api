package com.prgrossman.musicapi.controller;

import org.example.models.products.Guitar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/return1")
    public int return1(){
        return 1;
    }

//    @PostMapping("/returnGuitar")
//    public Guitar returnGuitar(){
//
//
//    }

}

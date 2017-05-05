package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * Created by user on 5/4/2017.
 */
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "NOT SURE HOW THIS WORKS!!!BUT I DID IT";}

}

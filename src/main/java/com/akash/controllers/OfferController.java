package com.akash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {

    @RequestMapping("/")
    public String showHome()
    {
        System.out.println("Welcome to Innovationm");
        return "index";
    }
}

package com.interview.playsafe.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversions")
public class ConversionsController {


    @GetMapping("/ktoc ")
    public @ResponseBody
    String greeting() {
        return "Hello, World";
    }


}

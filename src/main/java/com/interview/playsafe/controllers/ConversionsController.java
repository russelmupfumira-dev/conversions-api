package com.interview.playsafe.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.playsafe.models.ConversionEntity;
import com.interview.playsafe.services.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversions")
public class ConversionsController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/ktoc")
    public @ResponseBody
    ConversionEntity convertKelvinToCelcius(@RequestBody ConversionEntity conversionEntity) {
        return conversionService.convertKelvinToCelcius(conversionEntity);
    }


}

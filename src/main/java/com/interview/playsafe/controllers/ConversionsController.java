package com.interview.playsafe.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.playsafe.models.ConversionEntity;
import com.interview.playsafe.services.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/conversions")
public class ConversionsController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/ktoc")
    public @ResponseBody
    ConversionEntity convertKelvinToCelcius(@RequestBody @Valid ConversionEntity conversionEntity) {
        return conversionService.convertMetric(conversionEntity);
    }

    @GetMapping("/ctok")
    public @ResponseBody
    ConversionEntity convertCelciusToKelvin(@RequestBody @Valid ConversionEntity conversionEntity) {
        return conversionService.convertMetric(conversionEntity);
    }

    @GetMapping("/mtok")
    public @ResponseBody
    ConversionEntity convertMilesToKM(@RequestBody @Valid ConversionEntity conversionEntity) {
        return conversionService.convertMetric(conversionEntity);
    }

    @GetMapping("/ktom")
    public @ResponseBody
    ConversionEntity convertKMToMiles(@RequestBody @Valid ConversionEntity conversionEntity) {
        return conversionService.convertMetric(conversionEntity);
    }

}

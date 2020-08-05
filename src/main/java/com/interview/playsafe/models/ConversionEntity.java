package com.interview.playsafe.models;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class ConversionEntity {

    @NotBlank
    private Double valueToConvert;

    private Double result;

    @NotBlank
    private String metricFrom;

}

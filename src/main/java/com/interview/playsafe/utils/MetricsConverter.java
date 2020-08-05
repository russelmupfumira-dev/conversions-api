package com.interview.playsafe.utils;

import com.interview.playsafe.models.ConversionEntity;


public class MetricsConverter {

    private static Double DISTANCE_RATIO = 0.621371;
    private static Double TEMPERATURE_FACTOR = 273.15;

    public static ConversionEntity convertDistance(ConversionEntity conversionEntity){
        if(conversionEntity.getMetricFrom().equalsIgnoreCase(Metric.KM.name())){
            conversionEntity.setResult(conversionEntity.getValueToConvert()*DISTANCE_RATIO);
        } else if(conversionEntity.getMetricFrom().equalsIgnoreCase(Metric.MILES.name())){
            conversionEntity.setResult(conversionEntity.getValueToConvert()/DISTANCE_RATIO);
        }
        return conversionEntity;
    }

    public static ConversionEntity convertTemperature(ConversionEntity conversionEntity){
        if(conversionEntity.getMetricFrom().equalsIgnoreCase(Metric.DEGREES.name())){
            conversionEntity.setResult(conversionEntity.getValueToConvert() - TEMPERATURE_FACTOR);
        } else if(conversionEntity.getMetricFrom().equalsIgnoreCase(Metric.KELVIN.name())){
            conversionEntity.setResult(conversionEntity.getValueToConvert() + TEMPERATURE_FACTOR);
        }
        return conversionEntity;
    }
}

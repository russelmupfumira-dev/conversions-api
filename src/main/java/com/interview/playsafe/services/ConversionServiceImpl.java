package com.interview.playsafe.services;

import com.interview.playsafe.models.ConversionEntity;
import com.interview.playsafe.utils.Metric;
import com.interview.playsafe.utils.MetricsConverter;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class ConversionServiceImpl implements ConversionService{

    @Override
    public ConversionEntity convertMetric(ConversionEntity conversionEntity) {

        Metric metric = Metric.valueOf(conversionEntity.getMetricFrom());

        if(Metric.DISTANCE_METRICS.contains(metric)){
            return MetricsConverter.convertDistance(conversionEntity);
        } else if(Metric.TEMPERATURE_METRICS.contains(metric)){
            return MetricsConverter.convertTemperature(conversionEntity);
        }
        else{
            throw new Exception();
        }


    }

}

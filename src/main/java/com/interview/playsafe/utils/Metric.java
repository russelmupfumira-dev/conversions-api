package com.interview.playsafe.utils;

import java.util.EnumSet;

public enum Metric {
    KM("Km"),
    MILES("Miles"),
    CELCIUS("Celcius"),
    KELVIN("Kelvin");

    public static EnumSet<Metric> DISTANCE_METRICS = EnumSet.of(KM, MILES);

    public static EnumSet<Metric> TEMPERATURE_METRICS = EnumSet.of(CELCIUS, KELVIN);

    private String name;

    public String getName() {
        return this.name;
    }

    Metric(String name) {
        this.name = name;
    }

    public static Metric getEnum(String value) {
        for(Metric v : values())
            if(v.getName().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }
}

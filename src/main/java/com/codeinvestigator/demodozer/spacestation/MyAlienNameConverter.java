package com.codeinvestigator.demodozer.spacestation;

import org.dozer.DozerConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyAlienNameConverter extends DozerConverter {
    public MyAlienNameConverter() {
        super(String.class, String.class);
    }

    @Override
    public Object convertFrom(Object source, Object destination) {
        return ((String)source).toUpperCase() + "_toUpperCASE";
    }

    @Override
    public Object convertTo(Object source, Object destination) {
        return ((String)source).toLowerCase() + "_tolowercase";
    }
}

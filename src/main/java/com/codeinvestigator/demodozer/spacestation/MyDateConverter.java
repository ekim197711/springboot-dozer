package com.codeinvestigator.demodozer.spacestation;

import org.dozer.DozerConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDateConverter extends DozerConverter {
    public MyDateConverter() {
        super(LocalDate.class, String.class);
    }

    @Override
    public Object convertTo(Object source, Object destination) {
        LocalDate ldSource = (LocalDate)source;
        return ldSource.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    @Override
    public Object convertFrom(Object source, Object destination) {
        String strSource = (String)source;
        return LocalDate.parse(strSource, DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}

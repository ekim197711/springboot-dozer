package com.codeinvestigator.demodozer.spacestation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlienSpaceStation {
    private String name;
    private String weapon;
    private String serviceDate;
    private String captain;
    private HashMap<String, String> inventory;

    public String getTheNamePlease(){
        return name;
    }
    public void setTheNamePlease(String name){
        this.name = name;
    }
}

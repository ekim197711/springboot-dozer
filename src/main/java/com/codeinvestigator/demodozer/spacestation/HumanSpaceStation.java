package com.codeinvestigator.demodozer.spacestation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HumanSpaceStation {
    private String name;
    private Lazer lazer;
    private LocalDate lastService;
    private List<String> crewmembers;
    private String boxcontent;
}

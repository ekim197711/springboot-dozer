package com.codeinvestigator.demodozer.spacestation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lazer {
    private String model;
    private Integer cooldownTime;
}

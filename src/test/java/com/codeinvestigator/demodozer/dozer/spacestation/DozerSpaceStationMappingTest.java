package com.codeinvestigator.demodozer.dozer.spacestation;


import com.codeinvestigator.demodozer.aliens.AlienSpaceShip;
import com.codeinvestigator.demodozer.space.SpaceShip;
import com.codeinvestigator.demodozer.spacestation.AlienSpaceStation;
import com.codeinvestigator.demodozer.spacestation.HumanSpaceStation;
import com.codeinvestigator.demodozer.spacestation.Lazer;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class DozerSpaceStationMappingTest {


    @Test
    void mapHumanToAlienSpacestation() {
        DozerBeanMapper mapper = new DozerBeanMapper(List.of("my-dozerconfig.xml", "my-dozer-mapping.xml"));

        HumanSpaceStation humanSpaceStation = new HumanSpaceStation("   space station in Jupiter orbit   "
                , new Lazer("   L-101           ", 20)
                , LocalDate.now()
                , List.of("Mike", "Jens", "Sandra")
                , "Oranges and apples"

                );

        AlienSpaceStation alien = mapper.map(humanSpaceStation, AlienSpaceStation.class);
        System.out.println("Alien spacestation: " + alien);
    }
}



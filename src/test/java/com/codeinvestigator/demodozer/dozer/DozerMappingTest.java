package com.codeinvestigator.demodozer.dozer;


import com.codeinvestigator.demodozer.aliens.AlienSpaceShip;
import com.codeinvestigator.demodozer.space.SpaceShip;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.junit.jupiter.api.Test;

public class DozerMappingTest {


    @Test
    void testMappingAnAlienSpaceShip(){
        AlienSpaceShip al = new AlienSpaceShip(4, 234.7d, "TOKaZ!", "Large");
        SpaceShip spaceShip = SpaceShip.of(al);
        System.out.println("My spaceship: "+ spaceShip);
    }

    BeanMappingBuilder builderMinusCrew = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(SpaceShip.class, AlienSpaceShip.class)
                    .exclude("crew")
                    .exclude("crewmembers");
        }
    };

    @Test
    void testMappingASpaceShip(){
        SpaceShip spaceShip = new SpaceShip(4, "fastandbig", "Xtra Large");

        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(builderMinusCrew);
        AlienSpaceShip alienSpaceShip = mapper.map(spaceShip, AlienSpaceShip.class);
        System.out.println("My spaceship: "+ alienSpaceShip);
    }
}



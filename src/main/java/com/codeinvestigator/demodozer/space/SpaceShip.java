package com.codeinvestigator.demodozer.space;

import com.codeinvestigator.demodozer.aliens.AlienSpaceShip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dozer.DozerBeanMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    private Integer crew;
    private String name;
    private String size;

    public static SpaceShip of(AlienSpaceShip alienSpaceShip){
        DozerBeanMapper mapper = new DozerBeanMapper();
        SpaceShip spaceship = mapper.map(alienSpaceShip, SpaceShip.class);
        return spaceship;
    }
}

package org.calbert.demo.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Knight {
    private final Dragon dragon;

    @Autowired
    public Knight(Dragon dragon) {
        this.dragon = dragon;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void slayDragon() {
        dragon.slayDragon();
        System.out.println("Roaaaarr!");
        System.out.println("Dragon has been killed!");
    }
}

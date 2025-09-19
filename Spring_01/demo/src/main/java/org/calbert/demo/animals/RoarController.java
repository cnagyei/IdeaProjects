package org.calbert.demo.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoarController {
    private final Knight knight;

    @Autowired
    public  RoarController(Knight knight) {
        this.knight = knight;
        knight.slayDragon();
    }

    public Knight getKnight() {
        return knight;
    }
}

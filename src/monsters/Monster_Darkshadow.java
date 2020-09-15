package monsters;

import items.DodgePotion;
import items.HealthPotion;


import java.awt.*;

public class Monster_Darkshadow extends Monster{

    public Monster_Darkshadow() {
        setName("Darkshadow");
        setHitpoints(100);
        setLocation(new Point(14,11));
        addLoot(new HealthPotion());
        addLoot(new HealthPotion());
        addLoot(new DodgePotion());
        setPointReward(20);
    }
}

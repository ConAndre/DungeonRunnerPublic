package monsters;

import items.HealthPotion;
import items.StrengthPotion;

import java.awt.*;

public class Monster_Cyclops extends Monster {

    public Monster_Cyclops() {
        setName("Cyclops");
        setHitpoints(80);
        setLocation(new Point(10,11));
        addLoot(new HealthPotion());
        addLoot(new HealthPotion());
        addLoot(new StrengthPotion());
        setPointReward(10);
    }


}

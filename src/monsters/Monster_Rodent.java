package monsters;

import items.AccuracyPotion;
import items.HealthPotion;

import java.awt.*;

public class Monster_Rodent extends Monster{

    public Monster_Rodent() {
        setName("Rodent");
        setHitpoints(100);
        setLocation(new Point(7,15));
        addLoot(new HealthPotion());
        addLoot(new HealthPotion());
        addLoot(new AccuracyPotion());
        setPointReward(20);
    }
}

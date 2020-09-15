package monsters;

import items.DodgePotion;
import items.HealthPotion;

import java.awt.*;

public class Monster_Lich extends Monster{

    public Monster_Lich() {
        setName("Lich");
        setHitpoints(150);
        setLocation(new Point(10,18));
        addLoot(new HealthPotion());
        addLoot(new HealthPotion());
        addLoot(new DodgePotion());
        addLoot(new DodgePotion());
        setPointReward(20);
    }
}

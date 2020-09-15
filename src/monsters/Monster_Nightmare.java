package monsters;

import items.HealthPotion;
import items.StrengthPotion;

import java.awt.*;

public class Monster_Nightmare extends Monster {

    public Monster_Nightmare() {
        setName("Nightmare");
        setBoss(true);
        setHitpoints(300);
        setStrength(15);
        setAccuracy(20);
        setLocation(new Point(5,12));
        addLoot(new HealthPotion());
        addLoot(new HealthPotion());
        addLoot(new StrengthPotion());
        setPointReward(30);
    }
}

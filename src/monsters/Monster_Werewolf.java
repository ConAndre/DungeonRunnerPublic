package monsters;

import items.HealthPotion;
import items.StrengthPotion;

import java.awt.*;

public class Monster_Werewolf extends Monster{
    public Monster_Werewolf() {
        setName("Werewolf");
        setHitpoints(100);
        setLocation(new Point(18,12));
        addLoot(new HealthPotion());
        addLoot(new HealthPotion());
        addLoot(new StrengthPotion());
        setPointReward(20);
    }


}

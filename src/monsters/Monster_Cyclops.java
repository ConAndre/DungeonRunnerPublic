package monsters;

import java.awt.*;

public class Monster_Cyclops extends Monster {


    private final String name = "Cyclops";

    private int hitpoints = 100;

    private final Point location = new Point(10,11);

    @Override
    public int getHitpoints() {
        return hitpoints;
    }

    @Override
    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Point getLocation() {
        return location;
    }
}

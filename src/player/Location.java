package player;

import dungeon.Dungeon;
import dungeon.DungeonMap;

import java.awt.*;
import java.util.ArrayList;

public class Location {

    private final Point location = DungeonMap.SPAWN;

    public Point getLocation() {
        return location;
    }

    public void availableLocations(Dungeon dungeon, Player player) {
        ArrayList<String> possibleLocations = new ArrayList<>();
        if (dungeon.getDungeonLayout().containsKey(new Point( (int) player.location().getLocation().getX(),
                (int) player.location().getLocation().getY() + 1 ))) {
            possibleLocations.add(dungeon.getDungeonLayout().get(new Point(player.location().getLocation().x, player.location().getLocation().y + 1)) + " (North)");
        }
        if (dungeon.getDungeonLayout().containsKey(new Point( (int) player.location().getLocation().getX() + 1,
                (int) player.location().getLocation().getY() ))) {
            possibleLocations.add(dungeon.getDungeonLayout().get(new Point(player.location().getLocation().x + 1, player.location().getLocation().y)) + " (East)");
        }

        if (dungeon.getDungeonLayout().containsKey(new Point( (int) player.location().getLocation().getX(),
                (int) player.location().getLocation().getY() -1 ))) {
            possibleLocations.add(dungeon.getDungeonLayout().get(new Point(player.location().getLocation().x, player.location().getLocation().y -1)) + " (South)");
        }

        if (dungeon.getDungeonLayout().containsKey(new Point( (int) player.location().getLocation().getX() -1 ,
                (int) player.location().getLocation().getY() ))) {
            possibleLocations.add(dungeon.getDungeonLayout().get(new Point(player.location().getLocation().x -1, player.location().getLocation().y )) + " (West)");
        }
        System.out.println("Available Options: " + possibleLocations );
        possibleLocations.clear();
    }

}

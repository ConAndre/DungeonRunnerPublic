package dungeon;

import java.awt.*;
import java.util.ArrayList;

public class DungeonMap {


    //The map is 20x20 because that's the arbitrary number I chose, not for any other reason
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    public static final Point SPAWN = new Point(10,10);


    private final ArrayList<Character> mapUnits = new ArrayList<>();

    public ArrayList<Character> getMapUnits() {
        return mapUnits;
    }

    public void initDungeonMap() {
        for (int i = 0; i < WIDTH*HEIGHT; i++) {
            mapUnits.add('-');
        }
        this.getMapUnits().set((DungeonMap.SPAWN.x -1 ) + DungeonMap.SPAWN.y * DungeonMap.WIDTH, 'X'); // Marks player location on the map upon spawn

    }
    public void displayDungeonMap() {
        for(int i = 0; i < WIDTH*HEIGHT; i++) {
            System.out.print(mapUnits.get(i) + "  ");
            if ((i + 1) % WIDTH == 0 ) {
                System.out.println();
            }
        }
    }
}

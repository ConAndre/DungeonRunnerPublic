package dungeon;

import java.awt.*;
import java.util.HashMap;

public class Dungeon {


    public Dungeon() {
        generateDungeonRooms();
    }

    private final HashMap<Point, String> layout = new HashMap<>();

    public HashMap<Point, String> getDungeonLayout() {
        return layout;
    }
    public void generateDungeonRooms() {

        //Ensure these coordinates are within the height and width of the dungeon map. (0,0) > (20,20) currently
        layout.put(new Point(10,10), "Starting Room"); //Spawn Room
        // Path 1
        layout.put(new Point(10,11), "Hallway");
        layout.put(new Point(10,12), "Kitchen");
        layout.put(new Point(11,12), "Hallway");
        layout.put(new Point(12,12), "Boiler Room");
        layout.put(new Point(12,13), "Hallway");
        layout.put(new Point(13,13), "Hallway");
        layout.put(new Point(13,14), "Hallway");
        layout.put(new Point(13,15), "Statue Room");
        layout.put(new Point(12,15), "Hallway");
        layout.put(new Point(11,15), "Hallway");
        layout.put(new Point(10,15), "Bogged Room");
        layout.put(new Point(9,15), "Hallway");
        layout.put(new Point(8,15), "Hallway");
        layout.put(new Point(7,15), "Butcher Room");
        layout.put(new Point(7,16), "Kitchen");
        layout.put(new Point(6,16), "Hallway");
        layout.put(new Point(5,16), "Barracks");
        layout.put(new Point(5,15), "Hallway");
        layout.put(new Point(5,14), "Hallway");
        layout.put(new Point(5,13), "Hallway");
        layout.put(new Point(5,12), "Wine Cellar");
        // Path 2
        layout.put(new Point(10, 9), "Hallway");
        layout.put(new Point(10, 8), "Garden");
        layout.put(new Point(11, 8), "Hallway");
        layout.put(new Point(12, 8), "Hallway");
        layout.put(new Point(13, 8), "Hallway");
        layout.put(new Point(14, 8), "Greenhouse");
        layout.put(new Point(14, 9), "Hallway");
        layout.put(new Point(14, 10), "Hallway");
        layout.put(new Point(14, 11), "Storage");
        // Path 3
        layout.put(new Point(14, 14), "Hallway");
        layout.put(new Point(15, 14), "Ballroom");
        layout.put(new Point(16, 14), "Hallway");
        layout.put(new Point(17, 14), "Workshop");
        layout.put(new Point(17, 13), "Hallway");
        layout.put(new Point(17, 12), "Theater");
        layout.put(new Point(17, 11), "Hallway");
        layout.put(new Point(17, 10), "Hallway");
        layout.put(new Point(17, 9), "Hallway");
        layout.put(new Point(17, 8), "Tomb Room");
        // Path 4
        layout.put(new Point(10, 16), "Hallway");
        layout.put(new Point(10, 17), "Parlor");
        layout.put(new Point(10, 18), "War Room");
        // Path 5
        layout.put(new Point(18, 12), "Lavatory");
    }
}


package player;

import dungeon.Dungeon;
import dungeon.DungeonMap;

import java.awt.*;
import java.util.Scanner;

public class Movement {


    private final Player player;

    public Movement(Player player) {
        this.player = player;
    }

    public void moveNorth(Dungeon dungeon, DungeonMap dungeonMap) {
        if (isAValidRoomNorth(dungeon)) {
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y ) * DungeonMap.WIDTH, '0'); // Mark last location before we move
            player.location().getLocation().setLocation(player.location().getLocation().getX(), player.location().getLocation().getY() + 1); // Moves the player north or 1 point up
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y ) * DungeonMap.WIDTH, 'X'); // Mark new location
        } else {
            invalidRoomMessage();
        }

    }
    public void moveEast(Dungeon dungeon, DungeonMap dungeonMap) {
        if (isAValidRoomEast(dungeon)) {
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y ) * DungeonMap.WIDTH, '0');
            player.location().getLocation().setLocation(player.location().getLocation().getX() + 1, player.location().getLocation().getY());
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y) * DungeonMap.WIDTH, 'X');
        } else {
            invalidRoomMessage();
        }

    }
    public void moveSouth(Dungeon dungeon, DungeonMap dungeonMap) {
        if (isAValidRoomSouth(dungeon)) {
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y ) * DungeonMap.WIDTH, '0');
            player.location().getLocation().setLocation(player.location().getLocation().getX(), player.location().getLocation().getY() -1 );
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y) * DungeonMap.WIDTH, 'X');
        } else {
            invalidRoomMessage();
        }

    }
    public void moveWest(Dungeon dungeon, DungeonMap dungeonMap) {
        if (isAValidRoomWest(dungeon)) {
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y ) * DungeonMap.WIDTH, '0');
            player.location().getLocation().setLocation(player.location().getLocation().getX() -1, player.location().getLocation().getY() );
            dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + (DungeonMap.HEIGHT - player.location().getLocation().y) * DungeonMap.WIDTH, 'X');
        } else {
            invalidRoomMessage();
        }

    }

    public boolean isAValidRoomNorth(Dungeon dungeon) {
        return dungeon.getDungeonLayout().containsKey(new Point((int) player.location().getLocation().getX(), // Checks if the direction the player chose is a valid room in the hashmap
                (int) player.location().getLocation().getY() + 1));
    }
    public boolean isAValidRoomEast(Dungeon dungeon) {
        return dungeon.getDungeonLayout().containsKey(new Point((int) player.location().getLocation().getX() + 1,
                (int) player.location().getLocation().getY()));
    }
    public boolean isAValidRoomSouth(Dungeon dungeon) {
        return dungeon.getDungeonLayout().containsKey(new Point((int) player.location().getLocation().getX(),
                (int) player.location().getLocation().getY() - 1));
    }
    public boolean isAValidRoomWest(Dungeon dungeon) {
        return dungeon.getDungeonLayout().containsKey(new Point((int) player.location().getLocation().getX() - 1, // Checks if the direction the player chose is a valid room in the hashmap
                (int) player.location().getLocation().getY()));
    }

    Scanner delay = new Scanner(System.in);

    public void invalidRoomMessage() {
                System.out.println("There doesn't seem to be a path this way." +
                        "\nPress enter to continue... ");
                delay.nextLine();
            }
}

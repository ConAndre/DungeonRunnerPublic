package player;

import dungeon.Dungeon;
import dungeon.DungeonMap;

import java.awt.*;
import java.util.Scanner;

public class Input {

    final Scanner playerInputScanner = new Scanner(System.in);
    public void getInput(Dungeon dungeon, DungeonMap dungeonMap, Player player) {
        String playerInput = playerInputScanner.nextLine();
        checkInput(dungeon, dungeonMap, player, playerInput);
    }

    public void checkInput(Dungeon dungeon, DungeonMap dungeonMap, Player player, String playerInput) {
        if (playerInput.equalsIgnoreCase("n")) {
            player.movement().moveNorth(dungeon, dungeonMap, player);
        } else if (playerInput.equalsIgnoreCase("e")) {
           player.movement().moveEast(dungeon, dungeonMap, player);
        } else if (playerInput.equalsIgnoreCase("s")) {
            player.movement().moveSouth(dungeon, dungeonMap, player);
        } else if (playerInput.equalsIgnoreCase("w")) {
            player.movement().moveWest(dungeon, dungeonMap, player);
            }
    }

    public void requestInput(Dungeon dungeon, DungeonMap dungeonMap, Player player) {
        dungeonMap.displayDungeonMap(); // Displays map to the user

        System.out.println("Current Location: " + dungeon.getDungeonLayout().get(player.location().getLocation()) +
                "\nWhat shall you do next?" + " N,E,S,W" );
        player.location().availableLocations(dungeon, player); // List rooms within 1 coordinate of player
        player.input().getInput(dungeon, dungeonMap, player); //Takes users input
    }
}

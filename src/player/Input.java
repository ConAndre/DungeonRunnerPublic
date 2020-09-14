package player;

import dungeon.Dungeon;
import dungeon.DungeonMap;

import java.awt.*;
import java.util.Scanner;

public class Input {

    private final Player player;

    public Input(Player player) {
        this.player = player;
    }

    final Scanner playerInputScanner = new Scanner(System.in);
    public void getInput(Dungeon dungeon, DungeonMap dungeonMap) {
        String playerInput = playerInputScanner.nextLine();
        checkInput(dungeon, dungeonMap, playerInput);
    }

    public void checkInput(Dungeon dungeon, DungeonMap dungeonMap, String playerInput) {
        if (playerInput.equalsIgnoreCase("n")) {
            player.movement().moveNorth(dungeon, dungeonMap);
        } else if (playerInput.equalsIgnoreCase("e")) {
           player.movement().moveEast(dungeon, dungeonMap);
        } else if (playerInput.equalsIgnoreCase("s")) {
            player.movement().moveSouth(dungeon, dungeonMap);
        } else if (playerInput.equalsIgnoreCase("w")) {
            player.movement().moveWest(dungeon, dungeonMap);
        } else if (playerInput.equalsIgnoreCase("i")){
            System.out.println(player.inventory().getInventory().toString());
            playerInputScanner.nextLine();
        }
    }

    public void requestInput(Dungeon dungeon, DungeonMap dungeonMap) {
        dungeonMap.displayDungeonMap(); // Displays map to the user

        System.out.println("Current Location: " + dungeon.getDungeonLayout().get(player.location().getLocation()) +
                "\nWhat shall you do next?" + " N,E,S,W" );
        player.location().availableLocations(dungeon); // List rooms within 1 coordinate of player
        player.input().getInput(dungeon, dungeonMap); //Takes users input
    }
}

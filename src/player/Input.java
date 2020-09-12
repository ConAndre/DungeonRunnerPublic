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
}

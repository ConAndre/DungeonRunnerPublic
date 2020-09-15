package player;

import dungeon.Dungeon;
import dungeon.DungeonMap;

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
            player.inventory().openInventory();
            playerInputScanner.nextLine();
        } else if (playerInput.equalsIgnoreCase("stats")) {
            player.skills().getTotal();
            System.out.println("Press enter to continue... ");
            playerInputScanner.nextLine();
        }
    }

    public void requestInput(Dungeon dungeon, DungeonMap dungeonMap) {
        dungeonMap.displayDungeonMap(); // Displays map to the user

        System.out.println("Current Location: " + dungeon.getDungeonLayout().get(player.location().getLocation()) +
                "\nWhat shall you do next?" + " \nN,E,S,W\n" +
                "i\n" +
                "stats" );
        player.location().availableLocations(dungeon);
        player.input().getInput(dungeon, dungeonMap);
    }
}

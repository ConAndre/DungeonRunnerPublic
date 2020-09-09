import dungeon.Dungeon;
import dungeon.DungeonMap;
import dungeon.DungeonMonsters;
import player.Player;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        //Initialize necessary classes/objects
        Dungeon dungeon = new Dungeon();
        DungeonMap dungeonMap = new DungeonMap();
        DungeonMonsters dungeonMonsters = new DungeonMonsters();
        Player player = new Player();

        ArrayList<String> possibleLocations = new ArrayList<>(); // array that holds possible movement choices for the player, probably could move this out of App class

        player.location().getLocation().setLocation(DungeonMap.SPAWN); //Set coordinate for player

        dungeon.generateDungeonRooms(); // Creates the rooms the player can visit (static)
        dungeonMap.initDungeonMap(); // Initializes map grid
        dungeonMonsters.initDungeonMonsters(); //Initializes dungeon monsters

        dungeonMap.getMapUnits().set((player.location().getLocation().x -1 ) + player.location().getLocation().y * DungeonMap.WIDTH, 'X'); // Marks player location on the map upon spawn

        System.out.println("Welcome player! You are placed in a room.");

        while (player.interactions().playerAlive()) {

            if (!(player.interactions().withinMonsterRoom(dungeonMonsters))) { //check if player is in a monster's room so they cant escape
                dungeonMap.displayDungeonMap(); // Displays map to the user
                System.out.println("Current Location: " + dungeon.getDungeonLayout().get(player.location().getLocation()) +
                    "\nWhat shall you do next?" + " N,E,S,W" );
                player.interactions().availableLocations(dungeon, possibleLocations); // List rooms within 1 coordinate of player
                player.interactions().playerMovement(dungeon, dungeonMap); // Looks at player's choice and determines whether or not the choice is valid and updates map based on choice
            } else {
                player.interactions().playerBattle();
            }

        }

    }
}

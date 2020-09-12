import dungeon.Dungeon;
import dungeon.DungeonMap;
import dungeon.DungeonMonsters;
import player.Player;
import player.Input;

import java.util.ArrayList;
public class App {

    public static void main(String[] args) {

        //Initialize necessary classes/objects
        Dungeon dungeon = new Dungeon();
        DungeonMap dungeonMap = new DungeonMap();
        DungeonMonsters dungeonMonsters = new DungeonMonsters();
        Player player = new Player();

        dungeon.generateDungeonRooms(); // Creates the rooms the player can visit (static)
        dungeonMap.initDungeonMap(); // Initializes map grid
        dungeonMonsters.initDungeonMonsters(); //Initializes dungeon monsters

        while (player.combat().playerAlive()) {
            if (!(player.combat().withinMonsterRoom(dungeonMonsters))) { //check if player is in a monster's room so they cant escape
                player.input().requestInput(dungeon, dungeonMap, player);
            } else {
                player.combat().playerBattle();
            }

        }
    }
}

import dungeon.Dungeon;
import dungeon.DungeonMap;
import dungeon.DungeonMonsters;
import player.Player;

public class App {

    public static void main(String[] args) {

        Dungeon dungeon = new Dungeon();
        DungeonMap dungeonMap = new DungeonMap();
        DungeonMonsters dungeonMonsters = new DungeonMonsters();

        Player player = new Player();

        while (player.combat().playerAlive()) {
            if (!(player.combat().withinMonsterRoom(dungeonMonsters))) {
                player.input().requestInput(dungeon, dungeonMap);
            } else {
                player.combat().playerBattle();
            }
            if (player.skills().getPoints() > 100) {
                System.out.println("Congratulations, you win!");
                return;
            }

        }
    }
}

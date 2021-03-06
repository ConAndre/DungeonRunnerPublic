package player;

import dungeon.DungeonMonsters;
import monsters.Monster;

import java.util.Scanner;


public class Combat {

    //This file gets clunky

    private Monster monsterInPlayerRoom;
    private final Player player;

    public Combat(Player player) {
        this.player = player;
    }

    //Checks if player is in a room with a monster and saves the monster in monsterInPlayerRoom var for later access.
    public boolean withinMonsterRoom(DungeonMonsters dungeonMonsters) {
        for (Object object : dungeonMonsters.getMonsterList()) {
            Monster monster = (Monster) object;
            if (player.location().getLocation().equals(monster.getLocation()) && (monster.getHitpoints() > 0)) { //if monster is alive and in the room
                this.monsterInPlayerRoom = monster;
                return true;
            }
        }
        return false;
    }

    //returns if the player is alive
    public boolean playerAlive() {
        if (player.skills().getHitpoints() > 0) {
            return true;
        }
        System.out.println("\nYou died!");
        return false;
    }

    final Scanner scannerBattle = new Scanner(System.in);
    private boolean notifyPlayer = true;

    public void playerBattle() {
        if (playerAlive() && monsterInPlayerRoom.getHitpoints() > 0) {
            if (notifyPlayer) {
            System.out.println("You spot a " + monsterInPlayerRoom.getName() + " in the room. You attack it quickly.");
            notifyPlayer = false;
            }
            scannerBattle.nextLine();
            monsterInPlayerRoom.monsterTakeDamage(monsterInPlayerRoom.rollDamage(player.skills().getStrength(),player.skills().getAccuracy()));
            scannerBattle.nextLine();
        }
       if (monsterInPlayerRoom.getHitpoints() > 0) {
           int monsterDamage = monsterInPlayerRoom.rollDamage(monsterInPlayerRoom.getStrength(), monsterInPlayerRoom.getAccuracy());
           monsterInPlayerRoom.monsterInflictDamage(monsterDamage, player);
       } else {
           notifyPlayer = true;
           System.out.println("You defeated the monster!");
           monsterInPlayerRoom.dropLoot(player);
           System.out.println("Press enter to continue...");
           scannerBattle.nextLine();
       }
    }
}

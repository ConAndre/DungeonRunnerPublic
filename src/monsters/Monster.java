package monsters;

import items.Item;
import player.Player;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Monster {

    final Random random = new Random();


    private String name = "null";
    private int hitpoints = 100;
    private int strength = 10;
    private int agility = 10;
    private int dodge = 10;
    private int accuracy = 10;
    private int pointReward = 0;

    private boolean isBoss;

    private Point location = new Point(0,0);

    private final ArrayList<Item> lootTable = new ArrayList<>();

    public int rollDamage(int strength, double accuracy ) {
        int damage;
        accuracy = accuracy + random.nextInt(100);
        if (accuracy < 50) {
            damage = 0;
            return damage;
        }
        damage = Math.max(0, strength + random.nextInt(strength-2));
        if (isBoss) {
            damage = damage + 5;
        }
        return damage;
    }

    public void monsterInflictDamage(int damage, Player player) {
        int playerDodge = player.skills().getDodge();
        if (random.nextInt(100) <= playerDodge)  {
            System.out.println("You manage to dodge an incoming attack. Health Remaining: " + player.skills().getHitpoints());
            return;
        }
        player.skills().setHitpoints(player.skills().getHitpoints() - damage);
        System.out.println("You take " + damage + " damage. Health Remaining: " + player.skills().getHitpoints());
    }

    public void monsterTakeDamage(int damage) {
        int monsterDodge = dodge;
        if (random.nextInt(100) < monsterDodge)  {
            System.out.println("The monster dodges your attack. Health Remaining: " + getHitpoints());
            return;
        }
        setHitpoints(getHitpoints() - damage);
        System.out.println( getName() + " takes "+ damage + " damage. Health Remaining: " + getHitpoints());
    }

    public void addLoot(Item item) {
        lootTable.add(item);
    }

    public void dropLoot(Player player) {
        for (Item item : this.getLootTable()) {
            player.inventory().addItem(item);
        }
        player.skills().addPoints(pointReward);
    }


    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }


    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getLootTable() {
        return lootTable;
    }

    public void setPointReward(int pointReward) {
        this.pointReward = pointReward;
    }

    public int getPointReward() {
        return pointReward;
    }

    public void setBoss(boolean boss) {
        this.isBoss = boss;
    }
}

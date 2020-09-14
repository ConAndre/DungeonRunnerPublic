package player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    //Unfinished


    private final Player player;

    public Inventory(Player player) {
        this.player = player;
    }

    private ArrayList<Object> Inventory = new ArrayList<>();

    public ArrayList<Object> getInventory() {
        return Inventory;
    }

    public boolean isInInventory(Map<Object, Integer> playerInventory, Object item) {
        return (playerInventory.containsKey((item)));
    }
//
//    public void addItem(String item) {
//        this.Inventory.put(item);
//        System.out.println("You pick up " + amount + " " + item + "(s)" );
//    }
}

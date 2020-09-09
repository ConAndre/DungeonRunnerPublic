package player;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    //Unfinished

    private Map<String, Integer> Inventory = new HashMap<>();

    public Map<String, Integer> getInventory() {
        return Inventory;
    }

    public boolean isInInventory(Map<String, Integer> playerInventory, String item) {
        return playerInventory.containsKey((item));
    }

    public void wipeInventory() {
        this.Inventory = new HashMap<>();
    }


    public void addItem(String item, int amount) {
        if (isInInventory(this.Inventory, item)) {
            this.Inventory.replace(item, this.Inventory.get(item) + amount);
        }
        else {
            this.Inventory.put(item, amount);
        }
        System.out.println("You pick up " + amount + " " + item + "(s)" );
    }
}

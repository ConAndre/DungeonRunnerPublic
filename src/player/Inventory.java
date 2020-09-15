package player;

import items.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private final Player player;

    public Inventory(Player player) {
        this.player = player;
    }

    private final ArrayList<Item> Inventory = new ArrayList<>();

    public ArrayList<Item> getInventory() {
        return Inventory;
    }


   public void addItem(Item item) {
       this.Inventory.add(item);
       System.out.println("You pick up a " + item.getName() );
   }

   public void openInventory() {
       if (player.inventory().getInventory().isEmpty())  {
           System.out.print("Inventory is empty!");
           return;
       }
       int currentEntry = 1;
       for (Item item : player.inventory().getInventory()) {
           System.out.println(currentEntry+". "+ item.getName());
           currentEntry++;
       }
       inventorySelection();
   }

   final Scanner inventoryOptionScanner = new Scanner(System.in);

   public void inventorySelection() {
        System.out.println("0. Exit\nSelect an option: ");
        int inventoryOption;
        try {
            int inventoryOptionTry = inventoryOptionScanner.nextInt();
            if (inventoryOptionTry > player.inventory().getInventory().size() || inventoryOptionTry <= 0 ) {
                System.out.println("Closing inventory...");
                return;
            }
                inventoryOption = inventoryOptionTry;
        } catch (Exception e) {
            System.out.println("Closing inventory...");
            return;
        }
        player.inventory().getInventory().get(inventoryOption - 1).onUse(player);
        openInventory();

   }
}

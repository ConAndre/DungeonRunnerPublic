package items;

import player.Player;

public class Item {

    private String name;
    private final boolean isWeapon = false;
    private String type;
    private int change;

    public void setChange(int change) {
        this.change = change;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void onUse(Player player) {
        if (!(isWeapon) ) {
            player.skills().setSkill(type, change);
            player.inventory().getInventory().remove(this);
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

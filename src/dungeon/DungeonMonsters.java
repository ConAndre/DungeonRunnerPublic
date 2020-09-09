package dungeon;

import monsters.Monster_Cyclops;

import java.util.ArrayList;

public class DungeonMonsters {

    private final ArrayList<Object> monsterList = new ArrayList<>();


    public void initDungeonMonsters() {
        monsterList.add(new Monster_Cyclops());


    }
    public ArrayList<Object> getMonsterList() {
        return monsterList;
    }



}

package com.room.devkasatkin;
import com.heroes.devkasatkin.Hero;
import com.heroes.devkasatkin.HeroControl;

public abstract class Room {
    private String name;
    private boolean isMonsterHere;
    private boolean isTreasureHere;
    private boolean isExitHere;
    private boolean isExitKeyHere;

    private HeroControl monster;

    public Room(String name, boolean isMonsterHere, boolean isTreasureHere, boolean isExitHere, boolean isExitKeyHere) {
        this.name = name;
        this.isMonsterHere = isMonsterHere;
        this.isTreasureHere = isTreasureHere;
        this.isExitHere = isExitHere;
        this.isExitKeyHere = isExitKeyHere;
    }

    public void addMonster(int health, int attack, int defence, String name) {
        this.monster = new HeroControl(new Hero(health, attack, defence, name));
    }
}

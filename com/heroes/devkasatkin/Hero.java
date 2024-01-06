package com.heroes.devkasatkin;

public class Hero {
    private int health;
    private int attack;
    private int defence;
    private  String name;

    public Hero(int health, int attack, int defence, String name) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name= " + name +
                ", health=" + health +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}

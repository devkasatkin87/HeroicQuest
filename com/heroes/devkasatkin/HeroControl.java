package com.heroes.devkasatkin;

public class HeroControl {
    private Hero hero;

    public HeroControl(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public void getDamage(int attack) {
        hero.setHealth(hero.getHealth() - attack);
    }

    public void makeAttack() {}
}

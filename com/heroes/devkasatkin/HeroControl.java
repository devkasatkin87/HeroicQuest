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
        if (attack > hero.getDefence()) {
            attack = attack - hero.getDefence();
            hero.setHealth(hero.getHealth() - attack);
        }
    }

    public void makeAttack() {}
}

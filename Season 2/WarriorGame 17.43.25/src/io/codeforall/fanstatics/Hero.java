package io.codeforall.fanstatics;

import java.util.Random;

public abstract class Hero {
    protected int health = 100;
    protected String name;
    protected Ability ability;
    protected Random random = new Random();

    public Hero(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
        return this.health;
    }



    public int attack() {
        return 10;
    }

    public void useAbility() {
        if (ability != null) {
            ability.useAbility(this);
        }
    }

    @Override
    public String toString() {
        return "Hero: " + name + " (Health: " + getHealth() + ")";
    }
}
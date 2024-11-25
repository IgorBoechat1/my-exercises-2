package io.codeforall.fanstatics.Heros;

import io.codeforall.fanstatics.Abilities.Fireball;
import io.codeforall.fanstatics.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
        this.ability = new Fireball();
    }

    @Override
    public String toString() {
        return "Mage: " + name + " (Health: " + getHealth() + ")";
    }
}
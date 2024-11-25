package io.codeforall.fanstatics.Heros;

import io.codeforall.fanstatics.Abilities.ShieldBlock;
import io.codeforall.fanstatics.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        this.ability = new ShieldBlock();
    }

    @Override
    public String toString() {
        return "Warrior: " + name + " (Health: " + getHealth() + ")";
    }
}
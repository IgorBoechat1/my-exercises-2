package io.codeforall.fanstatics.Heros;

import io.codeforall.fanstatics.Abilities.SneakAttack;
import io.codeforall.fanstatics.Hero;

public class Rogue extends Hero {
    public Rogue(String name) {
        super(name);
        this.ability = new SneakAttack();
    }

    @Override
    public String toString() {
        return "Rogue: " + name + " (Health: " + getHealth() + ")";
    }
}
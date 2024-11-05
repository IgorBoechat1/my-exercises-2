package io.codeforall.fanstatics.Heros;

import io.codeforall.fanstatics.Abilities.Heal;
import io.codeforall.fanstatics.Hero;

public class Cleric extends Hero {
    public Cleric(String name) {
        super(name);
        this.ability = new Heal();
    }

    @Override
    public String toString() {
        return "Cleric: " + name + " (Health: " + getHealth() + ")";
    }
}
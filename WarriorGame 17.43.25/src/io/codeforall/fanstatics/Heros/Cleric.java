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
        // Construct and return the string representation of the Cleric
        return "Cleric: " + name + " (Health: " + getHealth() + ")";
    }
/******  b7c6ef74-1254-4eb4-a1ce-18260eb9d66d  *******/
}
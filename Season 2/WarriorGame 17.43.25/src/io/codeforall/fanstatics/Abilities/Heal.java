package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.AbstractAbility;
import io.codeforall.fanstatics.Hero;

public class Heal extends AbstractAbility {
    

   private int healAmount = 5;

    @Override
    public void useAbility(Hero hero) {
        hero.takeDamage(-healAmount); // Cura o herói
    }
}
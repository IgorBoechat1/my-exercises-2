package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.AbstractAbility;
import io.codeforall.fanstatics.Hero;

public class ShieldBlock extends AbstractAbility {
    
     @Override
    public void useAbility(Hero hero) {
        System.out.println(hero + " raises a shield for protection!");
    }
}

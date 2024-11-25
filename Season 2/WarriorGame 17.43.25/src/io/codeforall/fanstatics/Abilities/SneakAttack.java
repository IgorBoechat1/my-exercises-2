package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.AbstractAbility;
import io.codeforall.fanstatics.Hero;

public class SneakAttack extends AbstractAbility {
    
    
    private int damage = 30;

    @Override
    public void useAbility(Hero hero) {
        // Exemplo de dano a um inimigo, poderia ser ajustado para o alvo correto
        System.out.println(hero + " performs a Sneak Attack for " + damage + " damage!");
}
}
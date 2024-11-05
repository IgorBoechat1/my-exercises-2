package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.AbstractAbility;
import io.codeforall.fanstatics.Hero;

public class Fireball extends AbstractAbility {

    private int damage = 25;

    @Override
    public void useAbility(Hero hero) {
        System.out.println(hero + " casts Fireball for " + damage + " damage!");
        // Aqui você pode colocar a lógica para diminuir a vida de um inimigo
    }
}

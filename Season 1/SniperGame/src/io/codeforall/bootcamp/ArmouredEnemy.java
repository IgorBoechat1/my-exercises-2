package io.codeforall.bootcamp;

public class ArmouredEnemy extends Enemy {
    private int armour = 50;

    @Override
    public void hit(){
        int hit = this.armour - sniperRifle.bulletDamage;
        if (this.armour <= 0){
            hit = getHealth() - sniperRifle.bulletDamage;

        }
    }




}

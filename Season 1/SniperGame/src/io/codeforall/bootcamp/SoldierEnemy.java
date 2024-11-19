package io.codeforall.bootcamp;

public class SoldierEnemy extends Enemy {
    private int hit;

    public void hit() {
        int hit = this.getHealth() - sniperRifle.bulletDamage;
    }
}

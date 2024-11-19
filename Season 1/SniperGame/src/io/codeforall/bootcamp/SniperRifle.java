package io.codeforall.bootcamp;

public class SniperRifle {
    public int bulletDamage = 50;


    public void shoot( ){
        double probability = Math.random();
        if (probability >= 0.8) {
            bulletDamage = 0;
        }
            bulletDamage = 50;
    }

    public int getBulletDamage() {
        return bulletDamage;
    }
}


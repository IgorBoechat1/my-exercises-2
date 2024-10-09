package io.codeforall.bootcamp;

public abstract class Enemy extends GameObject {
    private int health = 100;
    private boolean isDead = false;
    private String message = "Enemy";

    public boolean isDead() {
        if (health <= 0) {
            return !isDead;
        }
        return isDead;
    }

    SniperRifle sniperRifle = new SniperRifle();

    public void hit() {
        int hit = this.health - sniperRifle.bulletDamage;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public int getHealth() {
        return health;
    }
}





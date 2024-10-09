package io.codeforall.bootcamp.gameobject;

public enum BarrelType {
    PLASTIC(3),
    WOOD(2),
    METAL(4);

    private int maxDamage;

    BarrelType(int maxDamage){
    this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

}



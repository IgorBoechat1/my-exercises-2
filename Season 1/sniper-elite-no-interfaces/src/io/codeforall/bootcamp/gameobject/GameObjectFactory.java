package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.gameobject.decor.Tree;
import io.codeforall.bootcamp.gameobject.enemy.ArmouredEnemy;
import io.codeforall.bootcamp.gameobject.enemy.Enemy;
import io.codeforall.bootcamp.gameobject.enemy.SoldierEnemy;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;


    public static Enemy createEnemy() {

        return Math.random() > 0.7 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);

    }

    public static Barrel createBarrel() {
        int random = (int) (Math.random() * BarrelType.values().length);
        BarrelType barrelType = BarrelType.values()[random];

        switch (barrelType) {
            case PLASTIC:
                return new Barrel(BarrelType.PLASTIC);
            case METAL:
                return new Barrel(barrelType.METAL);
            case WOOD:
                return new Barrel(barrelType.WOOD);
        }
        return createBarrel();
    }



}

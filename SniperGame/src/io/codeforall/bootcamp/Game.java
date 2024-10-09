package io.codeforall.bootcamp;

import java.awt.font.FontRenderContext;

public class Game {

    public static final int GAME_OBJECTS = 5;
    private SniperRifle sniper1 = new SniperRifle();

    private GameObject[] objects;
    GameObject tree = new Tree();
    GameObject SE = new SoldierEnemy();
    GameObject AE = new ArmouredEnemy();

    public GameObject generateEnemies() {

        double probability = Math.random();
        if (probability >= 0.9) {
            System.out.println("Created Tree");
            return this.tree;

        }
        if (probability <= 0.4) {
            System.out.println("Created S.E");
            return this.SE;


        }
        System.out.println("Created A.E");
        return this.AE;
    }

    public Game() {
        objects = new GameObject[GAME_OBJECTS];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = generateEnemies();

        }


    }

    public void shooting() {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(tree)) {
                System.out.println("Don't shoot, I 'm a TREE!");
            }
            else if (objects[i].equals(SE)) {
                sniper1.shoot();
                System.out.println("Soldier Enemy got HIT!");
            }
            sniper1.shoot();
                sou

        }
    }


}


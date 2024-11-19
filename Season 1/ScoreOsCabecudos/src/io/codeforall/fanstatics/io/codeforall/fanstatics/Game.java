package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {
    public static final int CANVAS_WIDTH = 1250;
    public static final int CANVAS_HEIGHT = 720;

    Picture canvas;
    Ball ball;
    Player p1;
    Player p2;

    public Game(){
        canvas = new Picture(CANVAS_WIDTH, CANVAS_HEIGHT,"rsc/stadium.png");
        canvas.translate(-1550, -910);
        canvas.grow(-300, 0);
        canvas.draw();
        setupGoals();
        ball = new Ball();
        p1 = new Player(ControlScheme.WAD,50.0,800.0,"rsc/burger.png",-25,-25);
        p2 = new Player(ControlScheme.ARROWS,1050.0,200.0, "rsc/pizza1.png",-25, -25);
    }

    public void setupGoals(){
        Picture goal;
        goal = new Picture(0,0,"rsc/baliza.png");
        goal.grow(-50, -150);
        goal.translate(-55, 250);
        goal.draw();

        goal = new Picture(0,0,"rsc/baliza.png");
        goal.grow(-135, -140);
        goal.translate(1195, 230);
        goal.draw();

    }

    public void update(long millis) throws InterruptedException {
        while (true) {
            Thread.sleep(millis);
            p1.update();
            p2.update();
            ball.update(p1,p2);
            ball.getKickCollisionsForLeftPlayer(p1.getPlayerImage());
            ball.getKickCollisionsForRightPlayer(p2.getPlayerImage());
        }

    }

}
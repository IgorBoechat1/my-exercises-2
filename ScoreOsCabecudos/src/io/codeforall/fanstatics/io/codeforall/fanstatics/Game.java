package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {
    public static final int CANVAS_WIDTH = 1250;
    public static final int CANVAS_HEIGHT = 720;

    Picture canvas;
    Ball ball;
    Picture player1, player2;
    Player p1;
    Player p2;
    Score score;



    public Game(){
        canvas = new Picture(10, 10,  "/Users/igorboechat/Documents/PESSOAL/BOOTCAMP/my-exercises-2/ScoreOsCabecudos/rsc/stadium.jpg");
        canvas.draw();
        ball = new Ball();
        score = new Score();



        p1 = new Player(ControlScheme.WAD,50.0,500.0,"rsc/pizza1");
      //  p2 = new Player(ControlScheme.ARROWS,1200.0,500.0 );
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
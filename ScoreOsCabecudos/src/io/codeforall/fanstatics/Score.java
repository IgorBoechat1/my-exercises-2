package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Score {

    private int counter = 0;
    private Text text;
    private Rectangle rectangle;

    public Score(Score goal, ) {
    }

    // Se alguém marcar incrementa 1 adiciona o texto
    public void someoneScore() {
        Ball ball = new Ball();
        while (counter != 3) {
            //if (isGoal);
            counter++;
            this.text = new Text(250, 50, "playerX" + "SCORE!!");
            rectangle.draw();
            text.draw();



        }
        System.out.println("playerX" + "WINS");
    }





}


package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Text;
import javafx.scene.media.AudioClip;

import javax.print.attribute.standard.Media;
import java.io.File;

public class Score {
    private int p1Score;
    private int p2Score;
    private final int MAX_SCORE = 3;
    Text text;


/*
    public boolean player1Scored() {
        p1Score++;
        getPlayer1Score();
        checkForWinner();
        return false;
    }

    public boolean player2Scored() {
        p2Score++;
        getPlayer2Score();
        checkForWinner();
        return false;
    }

    private void checkForWinner() {
        if (p1Score >= MAX_SCORE) {
            text = new Text(50, 50, "PLAYER 1 WINS!");
            text.draw();
            resetScores();
        } else if (p2Score >= MAX_SCORE) {
            text = new Text(50, 50, "PLAYER 2 WINS");
            text.draw();
            resetScores();
        }
    }

    private void resetScores() {
        p1Score = 0;
        p2Score = 0;
    }

    public void getPlayer1Score() {
        if (player1Scored()) {
            text = new Text(50, 50, "PLAYER 1 SCORED!");
            text.draw();
        }
    }
    public void getPlayer2Score() {
        if (player2Scored()) {
            text = new Text(50, 50, "PLAYER 2 SCORED!");
            text.draw();

        }

    }

    public Text text(int i, int i1, String s) {
        return text;


    }
}
*/
}
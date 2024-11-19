package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class Cursor implements KeyboardHandler {

    private int direction = 1;

    private GridPosition pos;
    private Color color;
    private int colorChanger;
    private Keyboard keyboard;
    private Rectangle rectangle;


    public Cursor() {
        this.rectangle = new Rectangle(10, 10, 20, 20);
        rectangle.fill();
        rectangle.setColor(Color.BLUE);
        initKeyboard();

    }

    public void move() {

        switch (direction) {
            case 0:
                if (rectangle.getY() > 10) {
                    rectangle.translate(0, -20);
                }
                break;
            case 1:
                if (rectangle.getX() <= 730) {
                    rectangle.translate(20, 0);
                }
                break;
            case 2:
                if (rectangle.getY() <= 550) {
                    rectangle.translate(0, 20);
                }
                break;
            case 3:
                if (rectangle.getX() > 10) {
                    rectangle.translate(-20, 0);
                }
                break;
        }
    }

    private void initKeyboard() {
        this.keyboard = new Keyboard((KeyboardHandler) this);

        KeyboardEvent pintar = new KeyboardEvent();
        pintar.setKey(KeyboardEvent.KEY_SPACE);
        pintar.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(pintar);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveDown);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_SPACE:
                newColor(rectangle.getX(), rectangle.getY());
                break;
            case KeyboardEvent.KEY_RIGHT:
                rectangle.translate(20, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                rectangle.translate(-20, 0);
                break;
            case KeyboardEvent.KEY_UP:
                rectangle.translate(0, -20);
                break;
            case KeyboardEvent.KEY_DOWN:
                rectangle.translate(0, 20);
                break;

        }
    }

    private void newColor(int x, int y) {
        if (rectangle.isFilled()) {
            rectangle = new Rectangle(10,10,20,20);
            rectangle.setColor(Color.BLACK);
            rectangle.fill();
        }
        else{
            rectangle.delete();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}


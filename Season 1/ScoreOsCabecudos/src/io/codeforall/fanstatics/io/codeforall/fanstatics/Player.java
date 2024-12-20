package io.codeforall.fanstatics;



import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player implements KeyboardHandler {
    public static final Integer PLAYER_WIDTH = 70;
    public static final Integer PLAYER_HEIGHT = 100;
    private double initialX;
    private double initialY;
    private double x;
    private double y;
    private double velocityX;
    private double velocityY;
    private String imgPath;
    private int offsetX;
    private int offsetY;
    private static final double GRAVITY = 0.2;
    private static final double FRICTION = 0.9;

    private final Keyboard keyboard;
    private Picture playerImage;
    private final ControlScheme controlScheme;

    public Player(ControlScheme controlScheme, Double x, Double y, String imgPath, int offsetX, int offsetY) {
        this.controlScheme = controlScheme;
        this.x = x;
        this.y = y;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.imgPath = imgPath;
        this.initialX = x;
        this.initialY = y;
        playerImage = new Picture(PLAYER_WIDTH, PLAYER_HEIGHT, this.imgPath);
        playerImage.grow(offsetX, offsetY);
        playerImage.draw();
        this.keyboard = new Keyboard(this);

        this.initKeyboard();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void resetPlayer() {
        x = initialX;
        y = initialY;
    }

    private void initKeyboard() {
        KeyboardEvent moveRight = new KeyboardEvent();
        if (this.controlScheme == ControlScheme.ARROWS) {
            moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        } else if (this.controlScheme == ControlScheme.WAD) {
            moveRight.setKey(KeyboardEvent.KEY_D);
        }
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        if (this.controlScheme == ControlScheme.ARROWS) {
            moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        } else if (this.controlScheme == ControlScheme.WAD) {
            moveLeft.setKey(KeyboardEvent.KEY_A);
        }
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveLeft);

        KeyboardEvent jump = new KeyboardEvent();
        if (this.controlScheme == ControlScheme.ARROWS) {
            jump.setKey(KeyboardEvent.KEY_UP);
        } else if (this.controlScheme == ControlScheme.WAD) {
            jump.setKey(KeyboardEvent.KEY_W);
        }
        jump.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(jump);

        KeyboardEvent exit = new KeyboardEvent();

        exit.setKey(KeyboardEvent.KEY_H);

        exit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(exit);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
            case KeyboardEvent.KEY_D:
                // playerImage.translate(50, 0);
                this.velocityX = 15.0;
                break;
            case KeyboardEvent.KEY_LEFT:
            case KeyboardEvent.KEY_A:
                // playerImage.translate(-50, 0);
                this.velocityX = -15.0;
                break;
            case KeyboardEvent.KEY_UP:
            case KeyboardEvent.KEY_W:
                // playerImage.translate(0, -100);
                if (y == (Game.CANVAS_HEIGHT - PLAYER_HEIGHT)) {
                    this.velocityY = -10.0;
                }
                break;
            case KeyboardEvent.KEY_H:
                System.exit(0);
                break;
        }
    }

    public void update() {

        movement();

        checkCollisionsWithWalls();

        show();
    }

    private void movement() {
        velocityY += GRAVITY;

        x += velocityX;
        y += velocityY;

        velocityX *= FRICTION;
    }

    private void checkCollisionsWithWalls() {
        // Check for collision with the floor (bottom)
        if (y + PLAYER_HEIGHT >= Game.CANVAS_HEIGHT) {
            y = Game.CANVAS_HEIGHT - PLAYER_HEIGHT;
        }

        // Check for collision with the left wall
        if (x <= 0) {
            x = 0;
        }

        // Check for collision with the right wall
        if (x + PLAYER_WIDTH >= Game.CANVAS_WIDTH + 25) {
            x = (Game.CANVAS_WIDTH + 25) - PLAYER_WIDTH;
        }
    }

    private void show() {
        playerImage.delete();
        double deltaX = (x - playerImage.getX());
        double deltaY = y - playerImage.getY();
        if (Math.abs(deltaX) > 1 || Math.abs(deltaY) > 1) {
            playerImage.translate(deltaX, deltaY);
        }
        playerImage.draw();
    }

    public Picture getPlayerImage() {
        return playerImage;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
x
}

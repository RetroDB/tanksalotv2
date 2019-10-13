package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Movable;
import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;

public class PlayerTank extends GameObjects implements KeyboardHandler, Movable {

    private Picture pic;
    private final double MAX_SPEED = 0.3;
    private String path;
    private Keyboard keyboard;
    private double speed;
    private CollisionDetector collisionDetector;

    public PlayerTank(double x, double y, double width, double height, Picture pic, String path) {
        super(x, y, width, height);
        this.speed = 0;
        this.pic = pic;
        this.pic = new Picture(x,y,path);
        pic.draw();
    }




    @Override
    public void init(){


        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_A);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_D);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent shoot = new KeyboardEvent();
        shoot.setKey(KeyboardEvent.KEY_SPACE);
        shoot.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(shoot);

    }





    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }
}

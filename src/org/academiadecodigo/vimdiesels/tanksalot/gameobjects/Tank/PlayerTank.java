package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Movable;
import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public class PlayerTank extends Movable implements KeyboardHandler {

    private Picture pic;
    private final int MAX_SPEED = 15;
    private final int MOTIONDISTANCE = 3;
    private String path;
    private Keyboard keyboard;
    private int speed;
    private CollisionDetector collisionDetector;

    public PlayerTank(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);
        this.speed = 0;
        this.keyboard = new Keyboard(this);
        super.setPic(new Picture(super.getX(), super.getY(), super.getPath()));
        super.getPic().draw();
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
    public int getWidth(){

        return super.getWidth();
    }

    @Override
    public int getHeight(){

        return super.getHeight();
    }

    @Override
    public void moveInDirection(FieldDirection direction, int distance) {
        switch (direction) {

            case UP:
                super.moveUp(distance);
                super.getPic().load("resources/pics/UpTank.png");
                break;
            case DOWN:
                super.moveDown(distance);
                super.getPic().load("resources/pics/DownTank.png");
                break;
            case LEFT:
               super.moveLeft(distance);
                super.getPic().load("resources/pics/LeftTank.png");
                break;
            case RIGHT:
                super.moveRight(distance);
                super.getPic().load("resources/pics/RightTank.png");
                break;
        }
    }

    @Override
    public void keyPressed(KeyboardEvent e) {

        switch (e.getKey()) {
            case KeyboardEvent.KEY_A:
                super.setCurrentDirection(FieldDirection.LEFT);
                super.moveInDirection(FieldDirection.LEFT, MOTIONDISTANCE);
                break;
            case KeyboardEvent.KEY_D:
                super.setCurrentDirection(FieldDirection.RIGHT);
                super.moveInDirection(FieldDirection.RIGHT, -MOTIONDISTANCE);
                break;
            case KeyboardEvent.KEY_W:
                super.setCurrentDirection(FieldDirection.UP);
                super.moveInDirection(FieldDirection.UP, MOTIONDISTANCE);
                break;
            case KeyboardEvent.KEY_S:
                super.setCurrentDirection(FieldDirection.DOWN);
                super.moveInDirection(FieldDirection.DOWN, -MOTIONDISTANCE);
                break;
        }

        super.accelerate(super.getCurrentDirection());


    }



    @Override
    public void accelerate(FieldDirection direction) {
        super.setCurrentDirection(direction);
        this.speed = MAX_SPEED;

        for (int i = 0; i < 1; i++) {

            if (collisionDetector.check(this)) {
                this.moveInDirection(getOppositeDirection(direction), MOTIONDISTANCE);
                continue;
            }
            this.moveInDirection(direction, MOTIONDISTANCE);
        }
    }



    @Override
    public void keyReleased(KeyboardEvent e) {

    }

    @Override
    public void setCollisionDetector(CollisionDetector collisionDetector) {
        super.setCollisionDetector(collisionDetector);
    }

}

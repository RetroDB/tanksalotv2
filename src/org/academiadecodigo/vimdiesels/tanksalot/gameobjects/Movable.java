package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public abstract class Movable extends GameObjects {

    private FieldDirection currentDirection;
    private int speed;
    private int maxSpeed;
    private CollisionDetector collisionDetector;


    public Movable(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);
        this.currentDirection = FieldDirection.UP;
        this.speed = 0;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public void accelerate(FieldDirection direction) {
        this.currentDirection = direction;
        this.speed = maxSpeed;

        this.moveInDirection(direction, speed);
    }

    public void moveInDirection(FieldDirection direction, int distance) {

        int initialX = super.getX();
        int initialY = super.getY();

        switch (direction) {

            case UP:
                moveUp(distance);
                break;
            case DOWN:
                moveDown(distance);
                break;
            case LEFT:
                moveLeft(distance);
                break;
            case RIGHT:
                moveRight(distance);
                break;
        }

        int dx = super.getX() - initialX;
        int dy = super.getY() - initialY;

        super.getPic().translate(dx, dy);

    }

    public CollisionDetector getCollisionDetector() {
        return collisionDetector;
    }

    // TODO: 14/10/2019 Read below
    //Gonna be used just by AI tanks?
    public FieldDirection getOppositeDirection(FieldDirection direction) {

        FieldDirection dir = null;

        switch (direction) {

            case UP:
                dir = FieldDirection.DOWN;
                break;
            case DOWN:
                dir = FieldDirection.UP;
                break;
            case RIGHT:
                dir = FieldDirection.LEFT;
                break;
            case LEFT:
                dir = FieldDirection.RIGHT;
                break;
        }
        return dir;
    }

    public void moveUp(int dist) {
        int initialY = getY();
        moveTo(0, -dist);
        int dy = getY() - initialY;
        if (this.collisionDetector.check(this)) {
            moveTo(0, -dy);
        }
    }

    public void moveDown(int dist) {
        int initialY = getY();
        moveTo(0, -dist);
        int dy = getY() - initialY;
        if (this.collisionDetector.check(this)) {
            moveTo(0, -dy);
        }
    }

    public void moveLeft(int dist) {
        int initialX = getX();
        moveTo(-dist, 0);
        int dx = getX() - initialX;
        if (this.collisionDetector.check(this)) {
            moveTo(-dx, 0);
        }
    }

    protected void moveRight(int dist) {
        int initialX = getX();
        moveTo(-dist, 0);
        int dx = getX() - initialX;
        if (this.collisionDetector.check(this)) {
            moveTo(-dx, 0);
        }

    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveTo(int x, int y) {
        super.translate(x, y);
        super.getPic().draw();

    }

    public FieldDirection getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(FieldDirection currentDirection) {
        this.currentDirection = currentDirection;
    }

}

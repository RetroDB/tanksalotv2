package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.tank;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Movable;
import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public class Tank extends Movable {
    private FieldDirection currentDirection;


    public Tank(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);
        super.setPic(new Picture(super.getX(), super.getY(), super.getPath()));
        super.getPic().draw();
        currentDirection = FieldDirection.values()[(int)(Math.random()*
                FieldDirection.values().length)];

    }

    public FieldDirection chooseDirection() {
        FieldDirection newDirection = currentDirection;
        System.out.println(currentDirection);

        int directionChangeProbability = 4;
        if (Math.random() > (double) directionChangeProbability / 10) {
            newDirection = FieldDirection.values()[(int) (Math.random() * FieldDirection.values().length)];

            if (newDirection.isOpposite(currentDirection)) {
                return chooseDirection();
            }
        }
        return newDirection;
    }

    public void move(){
        accelerate(chooseDirection());
    }

    @Override
    public void moveUp(int dist) {
        int initialY = getY();
        moveTo(0, -dist);
        int dy = getY() - initialY;
        if (super.getCollisionDetector().check(this)) {
            currentDirection = getOppositeDirection(currentDirection);
            moveTo(0, -dy);
        }
    }

    @Override
    public void moveDown(int dist) {
        int initialY = getY();
        moveTo(0, -dist);
        int dy = getY() - initialY;
        if (super.getCollisionDetector().check(this)) {
            currentDirection = getOppositeDirection(currentDirection);
            moveTo(0, -dy);
        }
    }

    @Override
    public void moveLeft(int dist) {
        int initialX = getX();
        moveTo(-dist, 0);
        int dx = getX() - initialX;
        if (super.getCollisionDetector().check(this)) {
            currentDirection = getOppositeDirection(currentDirection);
            moveTo(-dx, 0);
        }
    }

    @Override
    protected void moveRight(int dist) {
        int initialX = getX();
        moveTo(-dist, 0);
        int dx = getX() - initialX;
        if (super.getCollisionDetector().check(this)) {
            currentDirection = getOppositeDirection(currentDirection);
            moveTo(-dx, 0);
        }

    }

    @Override
    public void accelerate(FieldDirection direction) {
        setCurrentDirection(direction);
        super.setSpeed(super.getMaxSpeed());

        for (int i = 0; i < 1; i++) {
            moveInDirection(super.getCurrentDirection(),3);
            }
    }

    @Override
    public void moveInDirection(FieldDirection direction, int distance) {
        switch (direction){
            case UP:
                super.moveUp(distance);
                super.getPic().load("resources/pics/UpArmorTank.png");
                break;
            case DOWN:
                super.moveDown(distance);
                super.getPic().load("resources/pics/DownArmorTank.png");
                break;
            case LEFT:
                super.moveLeft(distance);
                super.getPic().load("resources/pics/LeftArmorTank.png");
                break;
            case RIGHT:
                super.moveRight(distance);
                super.getPic().load("resources/pics/RightArmorTank.png");
                break;
        }
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setCollisionDetector(CollisionDetector collisionDetector) {
        super.setCollisionDetector(collisionDetector);
    }


    @Override
    public void setCurrentDirection(FieldDirection currentDirection) {
        super.setCurrentDirection(currentDirection);
    }
}

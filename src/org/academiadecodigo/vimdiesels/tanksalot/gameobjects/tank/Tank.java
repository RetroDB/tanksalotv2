package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.tank;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Movable;
import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public class Tank extends Movable {

    private boolean destroyed;
    private FieldDirection direction;
    private final int directionChangeProbability = 10;
    private Tank[] tanks;

    public Tank(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);
        super.setPic(new Picture(super.getX(), super.getY(), super.getPath()));
        super.getPic().draw();
        this.destroyed = false;
    }

    public FieldDirection chooseDirection() {
        FieldDirection newDirection = getCurrentDirection();

        if (Math.random() > (double) directionChangeProbability / 10) {
            newDirection = FieldDirection.values()[(int) (Math.random() * FieldDirection.values().length)];

            if (newDirection.isOpposite(getCurrentDirection())) {
                return chooseDirection();
            }
        }
        return newDirection;
    }

    public void move(){
        accelerate(chooseDirection());
    }

    @Override
    public void accelerate(FieldDirection direction) {
        super.setCurrentDirection(direction);
        super.setSpeed(3);

        for (int i = 0; i < 1; i++) {
            super.moveInDirection(super.getCurrentDirection(),3);
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
                super.moveUp(distance);
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
    public void moveUp(int dist) {
        super.moveUp(dist);
    }

    @Override
    public void moveDown(int dist) {
        super.moveDown(dist);
    }

    @Override
    public void moveLeft(int dist) {
        super.moveLeft(dist);
    }

    @Override
    protected void moveRight(int dist) {
        super.moveRight(dist);
    }

    @Override
    public FieldDirection getCurrentDirection() {
        return super.getCurrentDirection();
    }

    @Override
    public void setCurrentDirection(FieldDirection currentDirection) {
        super.setCurrentDirection(currentDirection);
    }
}

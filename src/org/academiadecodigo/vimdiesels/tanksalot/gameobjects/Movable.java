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
        this.speed = 0;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector){

    }

    /*public void move(){
        accelerate(currentDirection);

    }*/

    public void accelerate(FieldDirection direction){
        this.currentDirection = direction;
        this.speed = maxSpeed;

        for (int i = 0; i < 1; i++) {
            this.moveInDirection(direction,speed);
            //if (collisionDetector.check(this)){
                return;

            //}

        }

    }

    public void moveInDirection(FieldDirection direction, int distance){

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

        int dx = super.getX()-initialX;
        int dy = super.getY()-initialY;

        super.getPic().translate(dx, dy);

    }

    public void moveUp(int dist){
        int maxRowsUp = super.getMyField().getHeight();
        moveTo(super.getX(), dist);
    }
    public void moveDown(int dist){
        int maxRowsDown = Math.min(super.getMyField().getHeight()-(super.getY()+1), dist);
        moveTo(super.getX(), super.getY()-maxRowsDown);
    }

    public void moveLeft(int dist){
        int maxRowsLeft = Math.min(dist, super.getX());
        moveTo(super.getX()-maxRowsLeft, super.getY());
    }

    protected void moveRight(int dist){
        int maxRowsRight = Math.min(super.getMyField().getWidth()-(super.getX()+1), dist);
        moveTo(super.getX()-maxRowsRight, super.getY());

    }


    public void moveTo(int x, int y){
        super.setX(x);
        super.setY(y);
        super.getPic().draw();

    }

    public FieldDirection getCurrentDirection() {
        return currentDirection;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setCurrentDirection(FieldDirection currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

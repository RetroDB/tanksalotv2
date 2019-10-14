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

    public void move(){
        accelerate(currentDirection);

    }

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

    }

    public void moveUp(int dist){
        int maxRowsUp = super.getMyField().getHeight();
        super.getPic().translate(super.getX(), super.getY()-maxRowsUp);
        moveTo(super.getX(), super.getY()-dist);
    }
    public void moveDown(int dist){
        int maxRowsDown = Math.min(super.getMyField().getHeight()-(super.getY()+1), dist);
        super.getPic().translate(super.getX(),super.getY()-maxRowsDown);
        moveTo(super.getX(), super.getY()-maxRowsDown);
    }

    public void moveLeft(int dist){
        int maxRowsLeft = Math.min(dist, super.getX());
        super.getPic().translate(super.getX()-maxRowsLeft, super.getY());
        moveTo(super.getX()-maxRowsLeft, super.getY());
    }

    protected void moveRight(int dist){
        int maxRowsRight = Math.min(super.getMyField().getWidth()-(super.getX()+1), dist);
        super.getPic().translate(super.getX()-maxRowsRight, super.getY());
        moveTo(super.getX()-maxRowsRight, super.getY());

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

package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public abstract class GameObjects {

    private int x;
    private int y;
    private int height;
    private int width;
    private Field myField;
    private FieldDirection currentDirection;
    private Picture pic;

    public GameObjects(int x, int y, int width, int height, String path) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.pic = new Picture(x,y,path);

    }



    public GameObjects(){

    }

    public void init(){
        this.pic.draw();

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public void translateO(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void moveTo(int x, int y){

    }

    public boolean isHittingWall(Field myField){
        this.myField = myField;

        switch (currentDirection) {
            case LEFT:
                if (getX() <= 0) {
                    return true;
                }
                break;
            case RIGHT:
                if (getX() >= myField.getWidth()) {
                    return true;
                }
                break;
            case UP:
                if (getX() <= 0) {
                    return true;
                }
                break;
            case DOWN:
                if (getY() >= myField.getHeight()) {
                    return true;
                }
        }

        return false;

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

    private void moveUp(int dist){
        int maxRowsUp = (int) Math.min(dist, getY());
                moveTo(getX(), getY()-maxRowsUp);
    }
    private void moveDown(int dist){
        int maxRowsDown = Math.min(myField.getHeight()-(getY()+1), dist);
        moveTo(getX(), getY()-maxRowsDown);
    }

    private void moveLeft(int dist){
        int maxRowsLeft = (int) Math.min(dist, getX());
        moveTo(getX()-maxRowsLeft, getY());
    }

    private void moveRight(int dist){
        int maxRowsRight = (int) Math.min(myField.getWidth()-(getX()+1), dist);
        moveTo(getX()-maxRowsRight, getY());

    }

    @Override
    public String toString() {
        return "GameObjects{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}

package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank.PlayerTank;
import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public class Bullet extends Movable {

    private boolean alive = true;
    final int DISTANCE = 1;
    private PlayerTank playerTank;

    public Bullet(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);

        this.setPic(new Picture(super.getX(), super.getY(), path));
        this.getPic().draw();
    }

    public Bullet(int x, int y, String path, PlayerTank playerTank) {
        super(x, y, path);

        this.setPic(new Picture(super.getX(), super.getY(), path));
        this.getPic().draw();
    }


    public void move(FieldDirection direction) {


        while (this.isAlive()) {

            switch (direction){

                case UP:
                    moveUp(DISTANCE);
                    this.getPic().translate(0, -DISTANCE);
                    super.moveInDirection(direction, DISTANCE);
                    break;

                case RIGHT:
                    moveRight(DISTANCE);
                    this.getPic().translate(DISTANCE,0);
                    super.moveInDirection(direction, DISTANCE);
                    break;

                case LEFT:
                    moveLeft(DISTANCE);
                    this.getPic().translate(-DISTANCE,0);
                    super.moveInDirection(direction, DISTANCE);
                    break;

                case DOWN:
                    moveDown(DISTANCE);
                    this.getPic().translate(0,DISTANCE);
                    super.moveInDirection(direction, DISTANCE);
                    break;

            }




            continue;
        }
    }



    @Override
    public void moveDown(int dist){
        int initialY = getY();
        moveTo(0, -dist);
        int dy = getY() - initialY;
    }


    @Override
    public void moveUp(int dist){
        int initialY = getY();
        moveTo(0, -dist);
        int dy = getY() - initialY;
    }


    @Override
    public void moveRight(int dist){
        int initialX = getX();
        moveTo(0, -dist);
        int dy = getY() - initialX;
    }


    @Override
    public void moveLeft(int dist){
        int initialX = getX();
        moveTo(0, -dist);
        int dy = getY() - initialX;
    }




    public void die() {
        this.alive = false;
        this.getPic().delete();
    }

    public boolean isAlive() {
        return alive;
    }
}
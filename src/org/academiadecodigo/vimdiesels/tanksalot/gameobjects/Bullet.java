package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.stage.FieldDirection;

public class Bullet extends Movable {

    private boolean alive = true;
    private final int DISTANCE = 5;

    public Bullet(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);

        this.setPic(new Picture(super.getX(), super.getY(), path));
        this.getPic().draw();
    }

    public void move(FieldDirection direction) {

        while (alive) {

            switch (direction){

                case UP:
                    moveUp(DISTANCE);
                    break;
                case RIGHT:
                    moveRight(DISTANCE);
                    break;
                case LEFT:
                    moveLeft(DISTANCE);
                    break;
                case DOWN:
                    moveDown(DISTANCE);
                    break;

            }
            super.moveInDirection(direction, DISTANCE);

            if (this.getX() == 0 || this.getY() == 0 ||
                    this.getY() == this.getMyField().getHeight() || this.getX() == this.getMyField().getWidth()){

                this.die();
            }

            continue;
        }
    }

    public void die() {
        this.alive = false;
        this.getPic().delete();
    }

    public boolean isAlive() {
        return alive;
    }
}
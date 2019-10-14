package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.tank;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Movable;

public class Tank extends Movable {

    public Tank(int x, int y, int width, int height, String path, Field myField) {
        super(x, y, width, height, path, myField);
        super.setPic(new Picture(super.getX(), super.getY(), super.getPath()));
        super.getPic().draw();
    }



}

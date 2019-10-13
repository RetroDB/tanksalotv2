package org.academiadecodigo.vimdiesels.tanksalot;

import java.awt.*;

public class Field {

    public static final int PADDING = 10;
    private int width;
    private int height;
    private Rectangle canvas;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init(){
        this.canvas = new Rectangle(PADDING,PADDING,width,height);

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}

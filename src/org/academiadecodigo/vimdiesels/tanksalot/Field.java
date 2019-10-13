package org.academiadecodigo.vimdiesels.tanksalot;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field {

    public static final int PADDING = 10;
    private int width;
    private int height;
    private Rectangle rect;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init(){
        this.rect = new Rectangle(PADDING,PADDING,width,height);
        this.rect.setColor(Color.LIGHT_GRAY);
        this.rect.fill();

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}

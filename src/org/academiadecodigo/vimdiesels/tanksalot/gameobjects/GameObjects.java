package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.Field;

public abstract class GameObjects {

    private int x;
    private int y;
    private int height;
    private int width;
    private Field myField;
    private Picture pic;
    private String path;

    public GameObjects(int x, int y, int width, int height, String path, Field myField) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.pic = new Picture(x,y,path);
        this.myField = myField;
        this.path = path;

    }

    public GameObjects(int x, int y, int width, int height, Field myField) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.myField = myField;

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

    public void translate(int x, int y){
        this.x += x;
        this.y += y;
    }


    public Picture getPic() {
        return pic;
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

    public void setPic(Picture pic){
        this.pic = pic;
    }

    public String getPath(){
        return this.path;
    }
}

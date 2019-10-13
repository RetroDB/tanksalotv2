package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

public abstract class GameObjects {

    private double x;
    private double y;
    private double height;
    private double width;

    public GameObjects(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public GameObjects(){

    }

    public void init(){

    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void translateO(double x, double y){
        this.x += x;
        this.y += y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
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

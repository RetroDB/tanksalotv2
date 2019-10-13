package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class NonDestroyable extends GameObjects {

    private Picture pic;
    private String path;

    public NonDestroyable(double x, double y, double width, double height, String Path){
        super(x, y, width, height);
        this.path = path;
        this.pic = new Picture(x,y,path);
    }

    public void drawPicture(){
        this.pic.draw();
    }


}

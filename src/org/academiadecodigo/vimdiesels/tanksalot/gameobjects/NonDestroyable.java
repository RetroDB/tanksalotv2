package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class NonDestroyable extends GameObjects {

    private Picture picture;
    private String path;
    private int x;
    private int y;

    public NonDestroyable(int x, int y, int width, int height, String path){
        super(x, y, width, height, path);
    }

    @Override
    public void init(){
        super.init();
    }
}

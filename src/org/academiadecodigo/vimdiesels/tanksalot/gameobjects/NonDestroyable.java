package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.vimdiesels.tanksalot.Field;

public class NonDestroyable extends GameObjects {


    public NonDestroyable(int x, int y, int width, int height, String path, Field myField){
        super(x, y, width, height, path, myField);
    }

    @Override
    public void init(){
        super.init();
    }
}

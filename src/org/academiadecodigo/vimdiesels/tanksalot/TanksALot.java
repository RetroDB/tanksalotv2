package org.academiadecodigo.vimdiesels.tanksalot;


import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.stage.StageOne;

public class TanksALot {
    public static void main(String[] args) {
        Field myField = new Field(780, 780);
        myField.init();
        StageOne stageOne = new StageOne(39);
        stageOne.init();

        //Picture pic = new Picture(0,0, "resources/pics/Table.png");
        //pic.draw();
    }
}

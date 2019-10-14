package org.academiadecodigo.vimdiesels.tanksalot;


import org.academiadecodigo.vimdiesels.tanksalot.stage.StageOne;

public class TanksALot {
    public static void main(String[] args) {
        Field myField = new Field(780, 780);
        myField.init();
        StageOne stageOne = new StageOne(4,43, myField);
        stageOne.init();

    }
}

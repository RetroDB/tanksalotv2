package org.academiadecodigo.vimdiesels.tanksalot.stage;

import org.academiadecodigo.vimdiesels.tanksalot.Field;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.NonDestroyable;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank.PlayerTank;

public class StageOne {

    private GameObjects[] elements;
    private CollisionDetector collisionDetector;
    private Field myField;
    PlayerTank player;

    public StageOne(int numberOfElements, Field myField) {
        this.myField = myField;
        this.elements = new GameObjects[numberOfElements];
    }

    public void init(){



        elements[0] = getElement(70,130, 60, 120, "./resources/pics/lunch_table.png");
        elements[1] = getElement(70,310, 60, 120, "./resources/pics/lunch_table.png");

        elements[2] = getElement(220,70, 270, 30,"./resources/pics/Table.png");
        elements[3] = getElement(220,190, 270, 30, "./resources/pics/Table.png");
        elements[4] = getElement(220,310, 270, 30, "./resources/pics/Table.png");
        elements[5] = getElement(220,430, 270, 30, "./resources/pics/Table.png");

        elements[6] = getElement(550,70, 30, 60, "./resources/pics/lamp_red.png");
        elements[7] = getElement(550,190, 30, 60, "./resources/pics/lamp_red.png");
        elements[8] = getElement(550,310, 30, 60, "./resources/pics/lamp_red.png");

        elements[9] = getElement(550, 460, 30, 150, "./resources/pics/wall1.png");
        elements[10] = getElement(550, 640, 30, 120, "./resources/pics/wall2.png");
        elements[11] = getElement(580,460, 20, 30, "./resources/pics/wall3.png");

        elements[12] = getElement(640, 550, 0,0,"./resources/pics/grass1.png");
        elements[13] = getElement(760,730, 30, 60, "./resources/pics/tv_bckgrnd.png");

        elements[14]  = getElement(100,700, 300, 30, "./resources/pics/wall4.png");
        elements[15]  = getElement(70,700, 30, 90, "./resources/pics/wall5.png");
        elements[16]  = getElement(160,670, 180, 130, "./resources/pics/coffee_table.png");

        elements[17]  = getElement(160,20, 30, 30, "./resources/pics/ninja_turtle.png");

        elements[18]  = getElement(640,40, 90, 60, "./resources/pics/mc_table.psd.png");

        elements[19]  = getElement(730,160, 60, 30, "./resources/pics/bike-removebg-preview.png");
        elements[20]  = getElement(640,340,30, 30,"./resources/pics/poke_ball.png");

        elements[21]  = getElement(250,100, 30, 30, "resources/pics/chair.png");
        elements[22]  = getElement(310,100, 30, 30, "resources/pics/chair.png");
        elements[23]  = getElement(370,100,30, 30, "resources/pics/chair.png");
        elements[24]  = getElement(430,100,30, 30, "resources/pics/chair.png");
        elements[25]  = getElement(250,220,30, 30, "resources/pics/chair.png");
        elements[26]  = getElement(310,220,30, 30, "resources/pics/chair.png");
        elements[27]  = getElement(370,220,30, 30, "resources/pics/chair.png");
        elements[28]  = getElement(430,220,30, 30, "resources/pics/chair.png");
        elements[29]  = getElement(250,340,30, 30, "resources/pics/chair.png");
        elements[30]  = getElement(310,340,30, 30, "resources/pics/chair.png");
        elements[31]  = getElement(370,340,30, 30, "resources/pics/chair.png");
        elements[32]  = getElement(440,340,30, 30, "resources/pics/chair.png");
        elements[33]  = getElement(250,460,30, 30, "resources/pics/chair.png");
        elements[34]  = getElement(310,460,30, 30, "resources/pics/chair.png");
        elements[35]  = getElement(370,460,30, 30, "resources/pics/chair.png");
        elements[36]  = getElement(430,460,30, 30, "resources/pics/chair.png");

        elements[37]  = getElement(220,670,0,0, "resources/pics/microwave.png");
        elements[38]  = getElement(280,670,0,0, "resources/pics/microwave.png");

        player = new PlayerTank(460, 730, 60, 60,"./resources/pics/UpTank.png",myField);
        CollisionDetector collisionDetector = new CollisionDetector(elements);


        player.setCollisionDetector(collisionDetector);

        player.init();





    }


    public NonDestroyable getElement(int x, int y, int width, int height, String path){

        NonDestroyable nonDestroyable = new NonDestroyable(x, y, width, height, path, this.myField);
        nonDestroyable.init();


        return nonDestroyable;

    }


}
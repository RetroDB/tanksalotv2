package org.academiadecodigo.vimdiesels.tanksalot.stage;

import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.NonDestroyable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StageOne {

    private GameObjects[] elements;
    private CollisionDetector collisionDetector;


    public StageOne(int numberOfElements) {
        this.elements = new GameObjects[numberOfElements];
    }

    public void init(){

        //this.player = new PlayerTank(450, 720, 60, 60,"./resources/pics/UpTank.png");

        //player.init();


        elements[0] = getElement(60,120, 60, 120, "/Users/codecadet/Documents/game-projects/tanksalotv2/resources/pics/lunch_table.png");
        elements[1] = getElement(60,300, 60, 120, "./resources/pics/lunch_table.png");

        elements[2] = getElement(270,60, 270, 30,"./resources/pics/Table.png");
        elements[3] = getElement(210,180, 270, 30, "./resources/pics/Table.png");
        elements[4] = getElement(210,300, 270, 30, "./resources/pics/Table.png");
        elements[5] = getElement(210,420, 270, 30, "./resources/pics/Table.png");

        elements[6] = getElement(540,60, 30, 60, "./resources/pics/lamp_red.png");
        elements[7] = getElement(540,180, 30, 60, "./resources/pics/lamp_red.png");
        elements[8] = getElement(540,300, 30, 60, "./resources/pics/lamp_red.png");

        elements[9] = getElement(270, 450, 30, 150, "./resources/pics/wall1.png");
        elements[10] = getElement(270, 630, 30, 120, "./resources/pics/wall2.png");
        elements[11] = getElement(270,450, 210, 30, "./resources/pics/wall3.png");

        elements[12] = getElement(630, 540, 0,0,"./resources/pics/grass1.png");
        elements[13] = getElement(750,720, 30, 60, "./resources/pics/tv_bckgrnd.png");

        elements[14]  = getElement(90,690, 300, 30, "./resources/pics/wall4.png");
        elements[15]  = getElement(60,690, 30, 90, "./resources/pics/wall5.png");
        elements[16]  = getElement(150,660, 180, 130, "./resources/pics/coffee_table.png");

        elements[17]  = getElement(120,0, 30, 30, "./resources/pics/ninja_turtle.png");

        elements[18]  = getElement(630,30, 90, 60, "./resources/pics/mc_table.psd.png");

        elements[19]  = getElement(720,150, 60, 30, "./resources/pics/bike-removebg-preview.png");
        elements[20]  = getElement(630,330,30, 30,"./resources/pics/poke_ball.png");

        elements[21]  = getElement(240,90, 30, 30, "resources/pics/chair.png");
        elements[22]  = getElement(300,30, 30, 30, "resources/pics/chair.png");
        elements[23]  = getElement(360,90,30, 30, "resources/pics/chair.png");
        elements[24]  = getElement(420,90,30, 30, "resources/pics/chair.png");
        elements[25]  = getElement(240,210,30, 30, "resources/pics/chair.png");
        elements[26]  = getElement(300,210,30, 30, "resources/pics/chair.png");
        elements[27]  = getElement(360,210,30, 30, "resources/pics/chair.png");
        elements[28]  = getElement(420,210,30, 30, "resources/pics/chair.png");
        elements[29]  = getElement(240,330,30, 30, "resources/pics/chair.png");
        elements[30]  = getElement(300,330,30, 30, "resources/pics/chair.png");
        elements[31]  = getElement(360,330,30, 30, "resources/pics/chair.png");
        elements[32]  = getElement(430,330,30, 30, "resources/pics/chair.png");
        elements[33]  = getElement(240,450,30, 30, "resources/pics/chair.png");
        elements[34]  = getElement(300,450,30, 30, "resources/pics/chair.png");
        elements[35]  = getElement(360,450,30, 30, "resources/pics/chair.png");
        elements[36]  = getElement(420,450,30, 30, "resources/pics/chair.png");

        elements[37]  = getElement(210,660,0,0, "resources/pics/microwave.png");
        elements[38]  = getElement(270,660,0,0, "resources/pics/microwave.png");






    }


    public NonDestroyable getElement(int x, int y, int width, int height, String path){

        NonDestroyable nonDestroyable = new NonDestroyable(x, y, width, height, path);
        nonDestroyable.init();


        return nonDestroyable;

    }


}
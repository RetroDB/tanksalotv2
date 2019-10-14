package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.tank;

import org.academiadecodigo.vimdiesels.tanksalot.Field;

public class TankFactory {

    public static Tank getNewTank(Field field){
        int random = (int) (Math.random()*TankType.values().length);
        TankType tankType = TankType.values()[random];

        switch (tankType){
            case ARMORED_TANK:
                return new Tank(TankType.ARMORED_TANK);
            default:
                return new Tank(TankType.LIGHT_TANK);

        }
    }
}

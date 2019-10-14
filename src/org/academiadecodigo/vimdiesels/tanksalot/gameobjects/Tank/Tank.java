package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank;

import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;

public class Tank  {

    private int armor;
    private double speed;

    public Tank(TankType tankType){
        this.armor = tankType.getArmor();
        this.speed = tankType.getSpeed();
    }
}

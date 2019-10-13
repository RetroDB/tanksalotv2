package org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank;

public enum TankType {

    PLAYABLE_TANK(2, 2),
    LIGHT_TANK(1, 3),
    ARMORED_TANK(3, 1),
    PLAYER_TANK(1, 0);

    private int armor;
    private double speed;

    // TODO: 08-Oct-19 Add pictures to this!!!!
    TankType(int armor, int speed){

        this.armor = armor;
        this.speed = speed;
    }

    public int getArmor() {

        return armor;
    }

    public double getSpeed() {

        return speed;
    }
}

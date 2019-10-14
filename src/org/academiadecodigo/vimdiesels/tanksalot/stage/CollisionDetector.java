package org.academiadecodigo.vimdiesels.tanksalot.stage;

import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Movable;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank.PlayerTank;

public class CollisionDetector {

    private GameObjects[] gameObjects;


    public CollisionDetector(GameObjects[] gameObjects) {
        this.gameObjects = gameObjects;

        for (int i = 0; i < gameObjects.length; i++) {
            System.out.println(gameObjects[i]);
        }

    }

    private boolean collides(GameObjects a, GameObjects b){
        return  a.getX() < b.getX() + b.getWidth() &&
                a.getX() + a.getWidth() > b.getX() &&
                a.getY() < b.getY() + b.getHeight() &&
                a.getY() + a.getHeight() > b.getY();

    }

    public boolean check(Movable tank) {
        for (GameObjects gameObject : gameObjects) {

            System.out.println("TANK");
            System.out.println(tank);

            System.out.println("----");

            System.out.println("GAMEOBJECT");
            System.out.println(gameObject);

            if (collides(tank, gameObject)) {
                System.out.println("Shit's fucked");
                return true;
            }
        }
        System.out.println("Shit's not fucked");
        return false;
    }
}

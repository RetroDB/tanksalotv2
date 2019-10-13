package org.academiadecodigo.vimdiesels.tanksalot.stage;

import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.GameObjects;
import org.academiadecodigo.vimdiesels.tanksalot.gameobjects.Tank.PlayerTank;

public class CollisionDetector {

    private GameObjects[] gameObjects;


    public CollisionDetector(GameObjects[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    private boolean collides(GameObjects a, GameObjects b){
        return a.getX() < b.getX() + b.getWidth() &&
                a.getX() + a.getWidth() > b.getX() &&
                a.getY() < b.getY() + b.getHeight() &&
                a.getY() + a.getHeight() > b.getY();

    }

    public boolean check(PlayerTank player) {
        for (GameObjects gameObject : gameObjects) {
            if (collides(player, gameObject)) {
                return true;
            }
        }
        return false;
    }
}

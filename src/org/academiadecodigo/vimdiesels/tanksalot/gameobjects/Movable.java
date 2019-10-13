package org.academiadecodigo.vimdiesels.tanksalot.gameobjects;

import org.academiadecodigo.vimdiesels.tanksalot.stage.CollisionDetector;

public interface Movable {

    public void setCollisionDetector(CollisionDetector collisionDetector);
    public void move();

}

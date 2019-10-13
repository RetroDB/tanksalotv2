package org.academiadecodigo.vimdiesels.tanksalot.stage;

import org.academiadecodigo.vimdiesels.tanksalot.Field;

public enum FieldDirection {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public boolean isOpposite(FieldDirection direction) {
        return direction.equals(oppositeDirection());
    }

    public FieldDirection oppositeDirection() {

        FieldDirection opposite = null;

        switch (this) {
            case UP:
                opposite = FieldDirection.DOWN;
                break;
            case DOWN:
                opposite = FieldDirection.UP;
                break;
            case LEFT:
                opposite = FieldDirection.RIGHT;
                break;
            case RIGHT:
                opposite = FieldDirection.LEFT;
                break;
        }

        return opposite;
    }
}

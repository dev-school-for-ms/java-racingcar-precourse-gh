package racingcar.model;

import java.util.Random;

public class Engine {
    private static final int FORWARD_THRESHOLD = 4;
    private final Random random;

    public Engine() {
        this.random = new Random();
    }

    public boolean CanMoveFrward() {
        int randomNum = random.nextInt(10);

        // return randomNum >= FORWARD_THRESHOLD;
        boolean canMove = randomNum >= FORWARD_THRESHOLD; // true
        return canMove;
    }
}

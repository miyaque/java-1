package net.sevecek;

import net.sevecek.angrybirds.engine.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        AngryBird cervenyPtak;
        AngryBird bilyPtak;

        cervenyPtak = new AngryBird(BirdType.RED);

        cervenyPtak.move();
        cervenyPtak.move();
        cervenyPtak.turnLeft();
        cervenyPtak.move();
        cervenyPtak.move();

        bilyPtak = new AngryBird(BirdType.MATILDA);
        bilyPtak.turnLeft();
        bilyPtak.turnLeft();
        bilyPtak.move();
        bilyPtak.move();

        cervenyPtak.move();
        cervenyPtak.turnRight();
        cervenyPtak.move();
        cervenyPtak.move();

        bilyPtak.turnRight();
        bilyPtak.move();
        bilyPtak.move();
    }

}

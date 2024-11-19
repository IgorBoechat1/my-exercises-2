package io.codeforall.bootcamp;

public class MagicLamp {

    public int counter = 0;
    public int maxGenie;

    public MagicLamp(int maxGenie) {
        this.maxGenie = maxGenie;
        this.counter = counter;

    }

    public Genie lampRub() {
        counter++;
        if (counter > maxGenie) {

            return new Demon();
        }
        if (counter % 2 == 0) {

            return new FriendlyG(maxGenie);
        } else {

            return new GrumpyG(maxGenie);

        }


    }
}





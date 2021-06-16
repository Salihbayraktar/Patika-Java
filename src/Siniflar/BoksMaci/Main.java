package Siniflar.BoksMaci;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);


        int rndNumber = new Random().nextInt(2);
        Ring r;

        if (rndNumber == 0) {
            r = new Ring(marc, alex, 90, 100);
        } else {
            r = new Ring(alex, marc, 90, 100);
        }

        r.run();
    }
}

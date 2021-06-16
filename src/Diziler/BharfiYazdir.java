package Diziler;

public class BharfiYazdir {

    public static void main(String[] args) {
        String[][] letterB = new String[7][4];

        for (int r = 0; r < letterB.length; r++) {

            for (int c = 0; c < letterB[0].length; c++) {

                if (r % 3 == 0) {
                    letterB[r][c] = " * ";
                } else if (c % 3 == 0) {
                    letterB[r][c] = " * ";
                } else {
                    letterB[r][c] = "   ";
                }
            }

        }

        for (String[] strings : letterB) {

            for (int c = 0; c < letterB[0].length; c++) {
                System.out.print(strings[c]);
            }
            System.out.println();

        }

    }

}

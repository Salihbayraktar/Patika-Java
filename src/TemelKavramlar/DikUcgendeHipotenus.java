package TemelKavramlar;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DikUcgendeHipotenus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] edges = IntStream.range(0, 3).map(i -> scanner.nextInt()).toArray();

        float u = (float) (edges[0] + edges[1] + edges[2]) / 2;

        float area = (float)Math.sqrt(u * (u - edges[0]) * (u - edges[1]) * (u - edges[2]));

        System.out.println("Uçgenin Alanı : " + area);

    }

}

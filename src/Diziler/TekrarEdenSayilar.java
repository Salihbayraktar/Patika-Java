package Diziler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TekrarEdenSayilar {

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        Set<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < list.length; i++) {

            for (int j = i + 1; j < list.length; j++) {

                if (list[i] == list[j]) {
                    duplicate.add(list[i]);
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(duplicate.toArray()));


    }
}

package ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10000; i += 2500) {
            threadList.add(new Thread(new OrderMatic(i, i + 2500)));
        }

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        for (Integer evenNumber : OrderMatic.getEvenNumbers()) {
            System.out.print(evenNumber + ", ");
        }
        System.out.println();
        for (Integer oddNumber : OrderMatic.getOddNumbers()) {
            System.out.print(oddNumber + ", ");
        }

        System.out.println();
        System.out.println("Even size : " + OrderMatic.getEvenNumbers().size());
        System.out.println("Odd size : " + OrderMatic.getOddNumbers().size());

    }
}

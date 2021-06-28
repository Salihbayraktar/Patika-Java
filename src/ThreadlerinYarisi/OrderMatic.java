package ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderMatic implements Runnable {
    private static final ArrayList<Integer> oddNumbers = new ArrayList<>();
    private static final ArrayList<Integer> evenNumbers = new ArrayList<>();
    private static final Semaphore oddNumberSemaphore = new Semaphore(1, true);
    private static final Semaphore evenNumberSemaphore = new Semaphore(1, true);
    private final ArrayList<Integer> numbers;
    private int orderNo;

    public OrderMatic(int startNumber, int endNumber) {
        this.numbers = IntStream.range(startNumber, endNumber).boxed().collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public static ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    @Override
    public synchronized void run() {

        try {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    addEvenNumberToList(number);
                } else {
                    addOddNumberToList(number);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addEvenNumberToList(int number) throws InterruptedException {
        evenNumberSemaphore.acquire();

        evenNumbers.add(number);

        evenNumberSemaphore.release();

    }

    public void addOddNumberToList(int number) throws InterruptedException {
        oddNumberSemaphore.acquire();

        oddNumbers.add(number);

        oddNumberSemaphore.release();

    }

}

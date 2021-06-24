package PatikaStore.Builders;

import PatikaStore.Brand;
import PatikaStore.Main;
import PatikaStore.Products.Notebook;

import java.util.Scanner;

public class NotebookBuilder {

    private double price;
    private float discountRate;
    private int stock;
    private String name;
    private Brand brand;
    private int memoryCapacity;
    private float screenSize;
    private int ramCapacity;

    public NotebookBuilder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Notebook Name");
        this.name = scanner.nextLine();

        System.out.println("Enter Notebook Price");
        this.price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Notebook Brand");
        this.brand = Main.brandMap.get(scanner.nextLine());

        System.out.println("Enter Notebook Memory Capacity (HDD) ");
        this.memoryCapacity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Notebook Screen Size");
        this.screenSize = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter Notebook RAM Capacity");
        this.ramCapacity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Notebook successfully added");
    }


    public Notebook getNotebook() {
        return new Notebook(this.price, this.discountRate, this.stock, this.name, this.brand, this.memoryCapacity, this.screenSize, this.ramCapacity);
    }
}

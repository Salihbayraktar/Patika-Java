package PatikaStore.Builders;

import PatikaStore.Brand;
import PatikaStore.Main;
import PatikaStore.Products.CellPhone;

import java.util.Scanner;

public class CellPhoneBuilder {

    int cameraPixel;
    //private int id;
    private final double price;
    private float discountRate;
    private int stock;
    private final String name;
    private final Brand brand;
    private final int memoryCapacity;
    private final float screenSize;
    private final int ramCapacity;
    private final int batteryCapacity;
    private final String color;


    public CellPhoneBuilder() {
        // super();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Cell Phone Name");
        this.name = scanner.nextLine();

        System.out.println("Enter Cell Phone Price");
        this.price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Cell Phone Brand");
        this.brand = Main.brandMap.get(scanner.nextLine());

        System.out.println("Enter Cell Phone Memory Capacity (HDD) ");
        this.memoryCapacity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Cell Phone Screen Size");
        this.screenSize = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter Cell Phone RAM Capacity");
        this.ramCapacity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Cell Phone Camera MP");
        this.cameraPixel = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Cell Phone Battery Capacity (mAh)");
        this.batteryCapacity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Cell Phone Color");
        this.color = scanner.nextLine();


        System.out.println("Cell Phone successfully added");


    }


    public CellPhone getCellPhone() {
        return new CellPhone(this.price, this.discountRate, this.stock, this.name, this.brand, this.memoryCapacity, this.screenSize, this.ramCapacity, this.batteryCapacity, this.color, this.cameraPixel);
    }
}

package PatikaStore.Products;

import PatikaStore.Brand;

public class Notebook extends ProductAbstract {

    static int idCounter = 1;

    public Notebook(double price, float discountRate, int stock, String name, Brand brand, int memoryCapacity, float screenSize, int ramCapacity) {
        super(idCounter++, price, discountRate, stock, name, brand, memoryCapacity, screenSize, ramCapacity);
    }

    @Override
    public String toString() {
        return String.format("| %-4d| %-30s| %-9.2f TL   | %-10s| %-4d GB | %-5.2f Inch  | %-3d GB  |", getId(), getName(), getPrice(), getBrand().getName(), getMemoryCapacity(), getScreenSize(), getRamCapacity());

    }
}

package PatikaStore.Products;

import PatikaStore.Brand;

public class CellPhone extends ProductAbstract {
    private static int idCounter = 1;
    int cameraPixel;
    private int batteryCapacity;
    private String color;

    public CellPhone(double price, float discountRate, int stock, String name, Brand brand, int memoryCapacity, float screenSize, int ramCapacity, int batteryCapacity, String color, int cameraPixel) {
        super(idCounter++, price, discountRate, stock, name, brand, memoryCapacity, screenSize, ramCapacity);
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.cameraPixel = cameraPixel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    public void setCameraPixel(int cameraPixel) {
        this.cameraPixel = cameraPixel;
    }

    @Override
    public String toString() {
        return String.format("| %-4d| %-30s| %-9.2f TL   | %-10s| %-4d GB   | %-5.2f Inch   | %-3d MP  | %-5d mAh   | %-3d GB   | %-6s   |", getId(), getName(), getPrice(), getBrand().getName(), getMemoryCapacity(), getScreenSize(), getCameraPixel(), getBatteryCapacity(), getRamCapacity(), getColor());
    }
}

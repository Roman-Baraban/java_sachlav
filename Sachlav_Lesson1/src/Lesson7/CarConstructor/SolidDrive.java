package Lesson7.CarConstructor;

public class SolidDrive {
    private String brand;
    private int capacity;

    public SolidDrive(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SolidDrive{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

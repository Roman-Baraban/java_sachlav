package Lesson7.CarConstructor;

public class Chip {
    private String brand;
    private long fraquency;
    private int generation;

    public Chip(String brand, long fraquency, int generation) {
        this.brand = brand;
        this.fraquency = fraquency;
        this.generation = generation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getFraquency() {
        return fraquency;
    }

    public void setFraquency(long fraquency) {
        this.fraquency = fraquency;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "brand='" + brand + '\'' +
                ", fraquency=" + fraquency +
                ", generation=" + generation +
                '}';
    }
}

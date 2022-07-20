package Lesson7.CarConstructor;

public class GraphicCard {
    private long frequency;
    private String brand;

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public GraphicCard(long frequency, String brand) {
        this.frequency = frequency;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "frequency=" + frequency +
                ", brand='" + brand + '\'' +
                '}';
    }
}

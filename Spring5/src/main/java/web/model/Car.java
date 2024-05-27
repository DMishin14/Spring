package web.model;

public class Car {
    private String model;
    private String brand;
    private int yearOfRelease;

    public Car(String model, String brand, int yearOfRelease) {
        this.model = model;
        this.brand = brand;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return model + " " + brand + " " + yearOfRelease;
    }
}
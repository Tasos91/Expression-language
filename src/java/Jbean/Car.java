package Jbean;

public class Car {
    
    private String engine;
    private String brand;
    private String color;
    private int horsepower;

    public String getEngine() {
        return engine;
    }

    public Car(String engine, String brand, String color, int horsepower) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.horsepower = horsepower;
    }

    public Car() {
    }
    
    

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    
}

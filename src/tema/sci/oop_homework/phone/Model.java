package tema.sci.oop_homework.phone;

public class Model {

    private Brand brand;
    private String name;
    private String color;
    private String material;
    private int battery;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getBattery() {
        return battery;
    }

    public Model() {
    }

    public Model(Brand brand, String name, String color, String material, int battery) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.material = material;
        this.battery = battery;
    }
}

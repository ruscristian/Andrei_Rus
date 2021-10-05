package tema.sci.oop_homework.phone;

public class Model {

    private Brand brand;
    private String color;
    private String material;
    private int battery;




    public Model(Brand modelName, String color, String material, int battery) {
        this.brand = modelName;
        this.color = color;
        this.material = material;
        this.battery = battery;
    }



//

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getBattery() {
        return battery;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", battery=" + battery +
                '}';
    }
}

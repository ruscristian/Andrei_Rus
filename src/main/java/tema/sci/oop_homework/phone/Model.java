package tema.sci.oop_homework.phone;

public class Model {

    private Brand brand;
    private String color;
    private String material;
    private int battery;



    public Model() {

    }
    public Model(Brand modelName, String color, String material, int battery) {
        this.brand = modelName;
        this.color = color;
        this.material = material;
        this.battery = battery;
    }



    public int getBattery(Model modelObj) {
        return modelObj.battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
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

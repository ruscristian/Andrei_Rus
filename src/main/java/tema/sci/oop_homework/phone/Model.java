package tema.sci.oop_homework.phone;

public class Model {

    private Brand name;
    private String color;
    private String material;
    private int battery;

    public int getBattery(Model modelObj) {
        return modelObj.battery;
    }

    public Model(){
    }

    public Model(Brand modelName, String color, String material, int battery) {
//        this.name = Brand.getName() + modelName;
        this.name = modelName;
        this.color = color;
        this.material = material;
        this.battery = battery;
    }


    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", battery=" + battery +
                '}';
    }
}

package tema.sci.oop_homework.phone;

public class Model {

    private String name;
    private String color;
    private String material;
    private int battery;

    public Model(){

    }
    public Model(String name, String color, String material, int battery) {
        this.name = name;
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

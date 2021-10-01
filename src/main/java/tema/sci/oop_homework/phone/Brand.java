package tema.sci.oop_homework.phone;

import java.util.ArrayList;
import java.util.List;



public class Brand{


    private static String name;
    private Model model;


    public Brand(String name) {
        this.name = name;
    }
    private static List<Model> models = new ArrayList<Model>();

    public void addModel(Model model){
        this.model = new Model();
        this.models.add(model);
    }


    public static List<Model> getModels() { return models; }

    public static String getName() { return name; }


    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }
}

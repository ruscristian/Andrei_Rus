package tema.sci.oop_homework.phone;

import java.util.ArrayList;
import java.util.List;

public class Brand{

    private String name;

    public static List<Model> getModels() {
        return models;
    }

    private static List<Model> models = new ArrayList<>();

    public Brand(String name) {
        this.name = name;
    }

    public Model addModel(String model, String blue, String glass, int Baterry){

        Model insertModel = new Model();
        this.models.add(insertModel);
        return insertModel;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }
}

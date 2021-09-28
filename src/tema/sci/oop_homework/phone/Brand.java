package tema.sci.oop_homework.phone;

import java.util.ArrayList;
import java.util.List;

public class Brand extends Phone {

    private String name;

    private List<Model> models = new ArrayList<>();

    public Brand(String name) {
        this.name = name;
    }

    public Model addModel(Model model){

        Model insertModel = new Model(this ,
                model.getName(),
                model.getColor(),
                model.getMaterial(),
                model.getBattery());
        this.models.add(insertModel);
        return insertModel;
    }
}

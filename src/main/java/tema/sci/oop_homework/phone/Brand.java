package tema.sci.oop_homework.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Brand{


    private String name;
    private List<Model> models = new ArrayList<Model>();

    public Brand(String name) {
        this.name = name;
    }

    public void addModel(Model model){
        this.models.add(model);
    }


    public List<Model> getModels() { return Collections.unmodifiableList(models); }

    public String getName() { return name; }


    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }
}

package Projekt;

public class PlantController {
    private Plant model;
    private PlantView view;

    public PlantController(Plant model, PlantView view){
        this.model = model;
        this.view = view;
    }

    public void setPlantName(String name){
        model.setName(name);
    }

    public String getPlantName(){
        return model.getName();
    }

    public void setPlantId(String id){
        model.setId(id);
    }

    public String getPlantId(){
        return model.getId();
    }

    public void setPlantCategory(String category){
        model.setCategory(category);
    }

    public String getPlantCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printPlantDetails(model.getName(), model.getId(), model.getCategory());
    }
}

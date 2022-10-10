package Projekt;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Plant model  = retriveCourseFromDatabase();

        //Create a view : to write course details on console
        PlantView view = new PlantView();

        PlantController controller = new PlantController(model, view);

        controller.updateView();

        //update model data
        controller.setPlantName("Monstera");
        System.out.println("after updating, Plant Details are as follows");

        controller.updateView();
    }

    private static Plant retriveCourseFromDatabase(){
        Plant plant = new Plant();
        plant.setName("Deliciosa");
        plant.setId("01");
        plant.setCategory("tropical");
        return plant;
    }
}

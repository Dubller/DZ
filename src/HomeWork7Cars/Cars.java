package HomeWork7Cars;

import java.util.Arrays;

public class Cars {
    private static String Model;
    private String Color;
    private int YearOfProduction;
    private int MaxSpeed;
    private String category;

    public Cars() {

        Model = "Noun";
        Color = "Noun";
        YearOfProduction = 0;
        MaxSpeed = 0;
    }
    public Cars(String Model, String Color, int YearOfProduction, int MaxSpeed) {
        this.Model = Model;
        this.Color = Color;
        this.YearOfProduction = YearOfProduction;
        this.MaxSpeed = MaxSpeed;

    }

    public void setCategory(String category) {
        this.category = category;
    }


}



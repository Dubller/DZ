package HomeWork7Cars;



public class MyMain {

    public static void main(String[] args) {
        Cars[] cars = {new Ferrari("G21", "Red", 1988, 150),                          //0
                new Ferrari("G23", "White", 1992, 170),                    //1
                new Ferrari("G26", "Organ", 1995, 185),                      //2
                new Ferrari("Monza SP2", "Black", 2022, 300),                //3
                new Ford("Mustang g1", "Black", 1970, 170),                 //4
                new Ford("Mustang g5", "Black", 1975, 175),                //5
                new Ford("Mustang g10", "White", 1980, 180),              //6
                new Ford("Mustang BULLITT", "Blackberry", 2022, 295)};       //7

        Cars oldYearProduction = cars[0];
        Cars maxSpeedCar = cars[0];

        for (Cars car : cars) {
            if (car.getYearOfProduction() < oldYearProduction.getYearOfProduction()) {
                oldYearProduction = car;
            }
            if (car.getMaxSpeed() > maxSpeedCar.getMaxSpeed()) {
                maxSpeedCar = car;}
            }
        System.out.println();
        System.out.println("Самая старая машина из списка: " + oldYearProduction.getModel());
        System.out.println();
        System.out.println("Самая быстрая машина из списка: " + maxSpeedCar.getModel());
        }
    }





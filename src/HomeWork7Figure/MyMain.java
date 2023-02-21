package HomeWork7Figure;

public class MyMain {

    public static void main (String[] args) {

        Figure[] figure = {new Triangle(50, 50, 30),
                           new Rectangle(1,2,3,4),
                           new Circle((4)),
                           new Triangle(21,56,40),
                           new Circle(55)};


        System.out.println("Площадь треугольника 1: " +figure[0].getSquareTriangle());
        System.out.println("Периметр треугольника 1: "+ figure[0].getPerimeterTriangle());
        System.out.println(("Площадь прямоугольника 2: "+ figure[1].getSquareRectangle()));
        System.out.println("Периметр прямоугольника 2: "+ figure[1].getPerimeterRectangle());
        System.out.println("Периметр круга 3: "+ figure[2].getPerimeterCircle());
        System.out.println("Площадь круга 3: "+ figure[2].getSquareCircle());
        System.out.println("Площадь треугольника 4: " + figure[3].getSquareTriangle());
        System.out.println("Периметр треугольника 4: "+ figure[3].getPerimeterTriangle());
        System.out.println("Периметр круга 5: "+ figure[4].getPerimeterCircle());
        System.out.println("Площадь круга 5: "+ figure[4].getSquareCircle());


    }
}

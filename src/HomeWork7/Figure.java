package HomeWork7;

public class Figure {

    int x;
    int y;
    int z;
    int j;
    private String category;



    public Figure()
    {
        x = 0;
        y = 0;
        z = 0;
    }

    public Figure (int x, int y, int z, int j)
    {
        x = x;
        y = y;
        z = z;
        j = j;

    }
    public void setCategory (String category) {
        this.category = category;
    }



    public double getSquareTriangle() { // площадь треугольника
        int p=(x+y+z)/2;

        double square = Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return square;
    }

    public double getPerimeterTriangle() { //периметр треугольника
        double perimeter = z+y+x;
        return perimeter;
    }

    public double getSquareRectangle(){ // площадь прямоугольника
        double square = x+y+z+j;
        return square;
    }

    public double getPerimeterRectangle(){ // периметр прямоугольника
        double perimeter = (x*y)*(z*j);
        return perimeter;
    }

    public double getPerimeterCircle(){ // периметр круга через радиус
        double perimeter = 2*Math.PI*x; // через окружность будет perimeter = Math.PI * x
        return perimeter;
    }
    public double getSquareCircle() { // площадь через радиус
    double  square = x*x*Math.PI;
    return square;

    }
}




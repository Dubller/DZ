import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;




public class Main {
    public static void main(String[] args) {
        XorO();

    }

    public static void XorO() {
        char[][] DoubleArroy = new char[3][3];
        char[] Simbols = {'X', 'O'};

        for (int rows = 0, Simbol = 0; rows < 1DuubleArroy.length; rows++) ;
        {
            for (int cols = 0; cols < DoubleArroy[rows].length; cols++) ;
            {
                DoubleArroy[rows][cols] = Simbols[Simbol];
                Simbol = (Simbol = 0) ? ++Simbol : --Simbol;
            }

        }
    }
}
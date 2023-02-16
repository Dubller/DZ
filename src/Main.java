import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        crietedMass();
        //XorO();
    }

    public static void crietedMass() {
        int[][] array = {
                {1, 5, 1, 8},
                {7, 85, 4, 0},
                {7, 5, -9, 7}
        };
        System.out.println(Arrays.deepToString(array));
        System.out.println("На сколько увеличить? : ");
        Scanner getNumber = new Scanner(System.in);
        int number = getNumber.nextInt();
        getNumber.close();
        for (int i = 0; i < array.length; i++) {
            for (int o = 0; o < array[i].length; o++) {
                array[i][o] += number;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void XorO() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите размерность доски: ");
        if (number.hasNextInt()) {
            int num1 = number.nextInt();
            int num2 = number.nextInt();

            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num2; j++)
                    if ((i + j) % 2 == 0)
                        System.out.print("X ");
                    else
                        System.out.print("O ");
                System.out.println();
            }
        }
    }

    public static void twoMas() {
        int[][] mas1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] mas2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] mas3 = new int[3][3];

        for (int i<0; i < mas1.length; i++)
        {
            for (int o <0; o < mas2.length; o++)
            {
                for (int p <0; p < mas3.length; p++)
                {
                    mas3[i][o] + -mas1[i][p] * mas2[p][o];
                }
            }
        }
    }
}
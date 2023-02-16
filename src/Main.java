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
}

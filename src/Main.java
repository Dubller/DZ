import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //1. Создать двухмерный массив из целых чисел.
    //С помощью циклов "пройти" по всему массиву и увеличить каждый
    //элемент на заданное число. Пусть число, на которое будет
    //увеличиваться каждый элемент, задается из консоли.
    public static void main(String[] args) {
        // crietedMass();
        //XorO();
        //twoMass();
        //doubleMas();
        //digMass();
        sorterMass();
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


    //2. Шахматная доска
    //Создать программу для раскраски шахматной доски с помощью цикла.
    //Создать двумерный массив String'ов 8х8. С помощью циклов задать
    //элементам циклам значения B(Black) или W(White)
    public static void XorO() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите размерность доски: ");
        if (number.hasNextInt()) {
            int num1 = number.nextInt();
            int num2 = number.nextInt();

            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num2; j++)
                    if ((i + j) % 2 == 0)
                        System.out.print("W ");
                    else
                        System.out.print("B ");
                System.out.println();
            }
        }
    }

    //3. Умножение двух матриц
    //Создайте два массива целых чисел размером 3х3 (две
    //матрицы). Напишите программу для умножения двух матриц.
    //Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    //Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    //Ожидаемый результат: 1 2 3 1 1 1 0 0 0
    public static void twoMass() {
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

        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                for (int k = 0; k < mas1[i].length; k++) {
                    mas3[i][j] += mas1[i][k] * mas2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(mas3));
    }


    //4. Создайте двумерный массив целых чисел. Выведите на консоль сумму
    //всех элементов массива
    private static void doubleMass() {

        int[][] mas = {
                {2, 5, 8, 7},
                {2, 4, 8, -7},
                {8, 5, 2, 22},
                {7, -2, -99, 1}
        };
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int o = 0; o < mas[i].length; o++) {
                sum += mas[i][o];
            }
            System.out.println(Arrays.deepToString(mas));
            System.out.println("Общая сумма массивов составляет: " + sum);
        }
    }


    //5. Создайте двумерный массив. Выведите на консоль диагонали массива.

    private static void digMass() {

        int[][] mas = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        System.out.println("Вертикаль:");
        for (int i = 0; i < mas.length; i++) {
            for (int o = 0; o < mas[i].length; o++) {
                if (i == o) {
                    System.out.println(mas[i][o] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Горизонталь: ");
        for (int i = 0; i < mas.length; i++) {
            for (int o = 0; o < mas[i].length; o++) {
                if (i + o == mas.length - 1) {
                    System.out.print(mas[i][o] + " ");
                }
            }
        }
        System.out.println();
    }


    //6. Создайте двумерный массив целых чисел. Отсортируйте элементы в
    //строках двумерного массива по возрастанию

    private static void sorterMass() {

        int[][] mass = {{4, 2, 1, 5, 3}, {10,8,6,9,7} };

        for (int[] inst : mass ) {
            Arrays.sort(inst);
            System.out.println(Arrays.toString(inst));
        }
    }
}
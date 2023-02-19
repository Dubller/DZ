import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;




public class Main {
    public static void main(String[] args) {
         // massivnumber();

          //KodRemoveNumber();
         // getRandomNumbers2();
            TwoMas();
    }

    //   0. Создайте массив целых чисел. Напишете программу, которая выводит
    //   сообщение о том, входит ли заданное число в массив или нет. Пусть
    //   число для поиска задается с консоли (класс Scanner).
    static void massivnumber() {
        int[] mass1 = {1,-4,8,9};


             Scanner scanner = new Scanner(System.in);
             System.out.println("Введите цифру от 0 до 10, и программа проверит, входит ли данная цифра в массив: ");
             int numMass = scanner.nextInt();
             scanner.close();

        for (int i= 0; i<mass1.length; i++){
            if (mass1[i] == numMass) {
                System.out.println(numMass +": входит в массив");
                return;
            }
             }
        System.out.println(numMass+ ": не входит в массив");
    }


//  1. Создайте массив целых чисел. Удалите все вхождения
//заданного числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет
//- выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.

     static void  KodRemoveNumber() {
        int[] mass = {5,5,1,1,};
         System.out.println("Введите число для удаления из массива: ");
        Scanner delNum = new Scanner(System.in);
        int item = delNum.nextInt();
        int newmass = 0;

         for (int p = 0; p < mass.length; p++)
         {
             if (mass[p] != item)
             {
                 mass[newmass++] = mass[p];
             }
         }
         if (newmass == 0) {
             System.out.println();
     } else {
        System.out.println("Массив без удаленного числа :");

        for (int p = 0; p < newmass; p++)
        {
            System.out.print(mass[p] + " ");
        }
    }
}

    //2. Создайте и заполните массив случайным числами и выведете
    //максимальное, минимальное и среднее значение.
    //Для генерации случайного числа используйте метод Math.random().
    //Пусть будет возможность создавать массив произвольного
    //размера. Пусть размер массива вводится с консоли.

    private static void getRandomNumbers2() {


        Scanner scr = new Scanner(System.in);// Открываем сканнер.
        System.out.println("Введите размер массива: ");
    int size = scr.nextInt(); // Инициализируем переменную со сканнером.
        scr.close(); // Закрываем сканнер.
    int[] mass = new int[size]; // Создаем массив.
    Random random = new Random(); // Инициализируем рандом.

        for (int i = 0; i < size; i++) // Открываем цикл.
    {
        mass[i] = random.nextInt(10);
    }
    int maximumValue = mass[0]; // Максимальное значение.
    int minimumValue = mass[0]; // Минимальное значение.
    int sum = 0; // Сумма.

        for (int o = 0; o < size; o++) // Открываем цикл.
    {
        maximumValue = Math.max(maximumValue, mass[o]);
        minimumValue = Math.min(minimumValue, mass[o]);
        sum += mass[o];
    }
    double averageValue = (double) sum / size; // Выводим двойное среднее значение.
        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальное значение числа в массиве : " + maximumValue);
        System.out.println("Минимальное значение числа в массиве : " + minimumValue);
        System.out.println("Среднее значение всех числел в массиве : " + averageValue);
}



    //   3. Создайте 2 массива из 5 чисел.
    //Выведите массивы на консоль в двух отдельных строках.
    //Посчитайте среднее арифметическое элементов каждого массива и
    //сообщите, для какого из массивов это значение оказалось больше (либо
    //сообщите, что их средние арифметические равны).
    private static void TwoMas() {
        System.out.println("Вывод двух массивов");
        System.out.println();

        int[] arrOne = {2, 3, 4, 5, 1};
        int[] arrTwo = {2, 3, 4, 5, 12};
        int sumNumOne = 0;
        int sumNumTwo = 0;
        System.out.println("Массив 1 = " + Arrays.toString(arrOne));
        System.out.println("Массив 2 = " + Arrays.toString(arrTwo));
        System.out.println();

        for (int sumOne = 0; sumOne < arrOne.length; sumOne++) {
            sumNumOne += arrOne[sumOne];
        }
        for (int sumTwo =0; sumTwo <arrTwo.length; sumTwo++) {
            sumNumTwo += arrTwo[sumTwo];
        }
        int sumMass1 = sumNumOne / arrOne.length;
        int sumMass2 = sumNumTwo / arrTwo.length;

        if (sumNumOne < sumNumTwo) {System.out.println("Второй массив больше первого");}
        else if (sumNumOne > sumNumTwo) {System.out.println("Первый массив больше второго");}
        else System.out.println("Массивы равны");
    }
}
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;




public class Main {
    public static void main(String[] args) {
         massivnumber();

         // RemovingNumber();
         // getRandomNumbers2();
         // TwoMas();
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

    public static int[] KodRemoveNumber(int[] arr, Scanner Number) {
        int DeleteElement = 0;  //переменная для удаления символа
        int item = Number.nextInt();  //переменная для дальнешего кода

        for (int i = 0; i < arr.length; i++) // цикл
            if (arr[i] != item) //
                arr[DeleteElement++] = arr[i]; //переменная для удаления
        return Arrays.copyOf(arr, DeleteElement); // копирование кода
    }


    public static void RemovingNumber() {
        int[] arroy = {2, 9, 5, 2, 25, 9, 7, 2, 1, 2, 3, 3, 3, 2, 8, 7}; //массив

        Scanner Number = new Scanner(System.in); //сканер
        {
            for (Scanner item = Number; ; ) {  //ввод сканера
                {
                    arroy = KodRemoveNumber(arroy, item); //переменная
                    System.out.println("Enter number:" + Arrays.toString(arroy));
                    Number.close(); //закрытие сканера
                }

            }

        }

    }
    //2. Создайте и заполните массив случайным числами и выведете
    //максимальное, минимальное и среднее значение.
    //Для генерации случайного числа используйте метод Math.random().
    //Пусть будет возможность создавать массив произвольного
    //размера. Пусть размер массива вводится с консоли.

    static void getRandomNumbers2() {
        System.out.print("Введите размер массива: "); // Вводим размер массива
        Scanner Enter = new Scanner(System.in); //открываем сканер
        int size = Enter.nextInt(); //ввод размера в код

        Random randomNumber = new Random(); //рандомайзер
        {
            int[] mas = new int[size]; // создание массива
            for (int i = 0; i < size; i++) {  //открываем цикл
                mas[i] = randomNumber.nextInt(10); // вводим в массив рандомайзер. Числа до 10
                System.out.print("               " + mas[i]); //
                System.out.println(" ");
                {
                    int min = mas[i]; // переменнаая минимума
                    int max = mas[i]; // переменная максимума
                    int avg = 0; // переменная среднего значения
                    {
                        max = Math.max(max, mas[i]);  // код для подсчета
                        min = Math.min(min, mas[i]); // код для подсчета
                        avg += mas[i]; // код для подсчета

                    }
                    double AvgFinal = (double) avg / size; // среднее значение
                    System.out.println("Min: " + min);
                    System.out.println("Max: " + max);
                    System.out.println("Avg: " + AvgFinal);
                }
            }
        }
    }



    //   3. Создайте 2 массива из 5 чисел.
    //Выведите массивы на консоль в двух отдельных строках.
    //Посчитайте среднее арифметическое элементов каждого массива и
    //сообщите, для какого из массивов это значение оказалось больше (либо
    //сообщите, что их средние арифметические равны).
    private static void TwoMas() {
        System.out.println("Вывод двух массивов");
        System.out.println();

        int[] arrOne = {2, 25, 84, 83, 5};
        int[] arrTwo = {5, 7, 50, 81, 3};
        System.out.println("Массив 1 = " + Arrays.toString(arrOne));
        System.out.println("Массив 2 = " + Arrays.toString(arrTwo));
        System.out.println();

        int ArrOne = 0;
        int ArrTwo = 0;
        for (int i = 0; i < arrOne.length; i++) {
            ArrOne = arrOne[i];
            ArrTwo = arrTwo[i];}


        ArrOne /= arrOne.length;
        ArrTwo /= arrTwo.length;

        if (ArrOne == ArrTwo) {System.out.println("Массивы равны ");}
        else if (ArrOne > ArrTwo)
        {System.out.println("Первый массив больше второго");}
        else System.out.println("Второй массив больше первого");
    }
}
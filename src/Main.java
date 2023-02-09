public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println();
        System.out.println("Задание 2");
        task2();
        System.out.println();
        System.out.println("Задание 3");
        task3();
        System.out.println();
        System.out.println("Задание 4");
        task4();
        System.out.println();
        System.out.println("Задание 5");
        task5();
        System.out.println();
        System.out.println("Задание 6");
        task6();
        System.out.println();
        System.out.println("Задание 7");
        task7();
        System.out.println();
    }

    static void task1() {

        int num = 200;
        if (num < 10 && num >= 0) {System.out.printf("'%d'однозначное, положительное", num);}
        else if (num < 100 && num >=0) {System.out.printf("'%d'двухзначное, положительное", num);}
        else if (num >= 100 && num>=0) {System.out.printf("'%d'трехзначное, либо более цифр, положительное", num);}
        else if (num > -10 && num <= 0) {System.out.printf("'%d'однозначное, отрицательное", num);}
        else if (num > -100 && num <= 0) {System.out.printf("'%d'двухзначное, отрицательное", num);}
        else if (num <= -100 && num <=0) {System.out.printf("'%d'трехзначное, либо более цифр, отрицательное", num);}

    }

    static void task2() {
        int A = 1;
        int B = 25;
        int C = 19;

        int sumAB = A + B;
        int sumBC = B + C;
        int sumCA = C + A;

        if (sumCA > B) {
            System.out.println("Сумма CA больше B. Треугольник может существует");
        } else {
            System.out.println("Треугольник СА>B не существуе");
        }

        if (sumBC > A) {
            System.out.println("Сумма BC больше A. Треугольник может существует ");
        } else {
            System.out.println("Треугольник BC>A не может существовать ");
        }

        if (sumAB > C) {
            System.out.println("Сумма AB больше C. Треугольник может существует ");
        } else {
            System.out.println("Треугольник AB>C не может существовать ");
        }
    }

    static void task3() {

        int NZero = 654;

        if (NZero > 0) {
            NZero++;
            System.out.println(NZero);
        } else if (NZero < 0) {
            NZero -= 2;
            System.out.println(NZero);
        } else {
            NZero = 10;
            System.out.println(NZero);
        }
    }


    static void task4() {

        int n1 = 9;
        int n2 = 5;
        int n3 = -9;
        int PN = 0;

        if (n1 >= PN) {
            PN++;
        }
        if (n2 >= PN) {
            PN++;
        }
        if (n3 >= PN) {
            PN++;
        }
        System.out.printf("Колличество положительных чисел является (%d)", PN);
    }
    static void task5() {
        int n1 = -1;
        int n2 = -2;
        int n3 = -25842;
        int pn = 0;
        int mn = 0;

        if (n1<mn) {mn++;}
        if (n1>pn) {pn++;}

        if (n2<mn) {mn++;}
        if (n2>pn) {pn++;}

        if (n3<mn) {mn++;}
        if (n3>pn) {pn++;}
        System.out.printf("Число положителбных числе (%d),число отрицателных числе(%d)", pn, mn);


    }

    static void task6 () {
        int n1 = 85648;
        int n2 = 48447;

        if (n1 > n2) {
            System.out.println(n1);} else {System.out.println(n2);}

    }


    static void task7 () {

        int p = 654;

        if (p < 5) {
            System.out.printf("%d програмиста", p);
        } else {
            System.out.printf("%d програмистов", p);
        }
    }

    }
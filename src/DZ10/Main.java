package DZ10;

public class Main extends functional{

    public static void main(String[] args) {
        String document = "5254-aBa-4321-ZXa-1A2b";

// Вывести на экран в одну строку два первых блока по 4 цифры.
        functional.printTwoBlock(document);
        System.out.println();

//Вывести на экран номер документа, но блоки из трех букв заменить
//на *** (каждая буква заменятся на *).
        functional.replacementElement(document);
        System.out.println();

//Вывести на экран только одни буквы из номера документа в
//формате yyy/yyy/y/y в нижнем регистре.
        functional.deleteLetter(document);
        System.out.println();

//Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//класса StringBuilder).
        functional.uppercaseLetters(document);
        System.out.println();

//Проверить содержит ли номер документа последовательность abc и
//вывети сообщение содержит или нет(причем, abc и ABC считается
//одинаковой последовательностью).
        functional.checkingLetters(document);
        System.out.println();

//Проверить начинается ли номер документа с последовательности
//555.
        functional.checkingNumbers(document);
        System.out.println();

// Проверить заканчивается ли номер документа на
//последовательность 1a2b.
        functional.checkingNumberEnds(document);
        System.out.println();






    }
}

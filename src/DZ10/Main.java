package DZ10;

public class Main extends functional{

    public static void main(String[] args) {
        String document = "1234-aSd-4321-ZXc-1q2E3e";

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






    }
}

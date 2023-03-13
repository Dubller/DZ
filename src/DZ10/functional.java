package DZ10;

public class functional {

    public static void printTwoBlock(String document) {
        System.out.print(document.substring(0, 4));
        System.out.print(document.substring(9, 13));
        System.out.println();
    }

    public static void replacementElement(String document) {
        System.out.println(document.replaceAll("\\d", "*"));
    }

    public static void deleteLetter(String document) {
       String[] doc = document.split("-");
       String lettering = doc[1]+ "/" + doc[3] + "/" + doc[4].charAt(1) + "/" + doc[4].charAt(3);
       System.out.println(lettering.toLowerCase());
    }
}


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
        String lettering = doc[1] + "/" + doc[3] + "/" + doc[4].charAt(1) + "/" + doc[4].charAt(3);
        System.out.println(lettering.toLowerCase());
    }

    public static void uppercaseLetters(String document) {
        String[] doc = document.split("-");
        StringBuilder i = new StringBuilder("Letters:");
        i.append(doc[1].toUpperCase());
        i.append("/");
        i.append(doc[3].toUpperCase());
        i.append("/");
        i.append(doc[4].toUpperCase().charAt(1));
        i.append("/");
        i.append(doc[4].toUpperCase().charAt(3));
        i.append("/");
        System.out.println(i);
    }

    public static void checkingLetters(String documents) {
        Boolean letter  = documents.toLowerCase().replaceAll("-", "").
                replaceAll("\\d", "").contains("abc");
        System.out.println(letter ? "The document contains the sequence 'abc'" :
                "The document does not contain the sequence 'abc'");
    }
    public static void checkingNumbers(String documents) {
        boolean startNumber = documents.startsWith("555");
        System.out.println(startNumber ? "The document starts with the digits '555'" :
                "The document does not start with the digits '555'");
    }
    public static void checkingNumberEnds(String document) {
        boolean endsNumber = document.endsWith("1a2b");
        System.out.println(endsNumber ? "The document ends with these characters '1a2b'" :
                "The document does not end with these characters '1a2b'");
    }
}


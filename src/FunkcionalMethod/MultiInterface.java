package FunkcionalMethod;

import java.util.Scanner;

public class MultiInterface {
    public static void main(String args[]) {
        System.out.print("Enter 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        int enterUser  = scanner.nextInt();


        if (enterUser  == 1) {
            FunctionalMethod<String, String> reverseTheString = x -> {
                String result = "";
                for (int i = 0; i < x.length(); i++) {
                    result = x.charAt(i) + result;}
                return result;};


            Scanner scanner1 = new Scanner(System.in);
            String user = scanner1.nextLine();
            System.out.println(reverseTheString.paste(user));
            scanner1.close();
        }

        else if (enterUser  == 2) {
            FunctionalMethod<Integer, Integer> factorial = x -> {
                int result = 1;
                for (int i = 1; i <=x; i ++){
                    result = result*i;}
                return result;};
            System.out.println(factorial.paste(scanner.nextInt()));}

    }
}

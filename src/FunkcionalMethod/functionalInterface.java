package FunkcionalMethod;

import java.util.Scanner;

public class functionalInterface {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int inputZero = scn.nextInt();
        FunctionalClass anchor;
        if (inputZero == 1) {
            anchor = (s) -> {
                StringBuilder sB = new StringBuilder(s);
                return sB.reverse().toString();
            };
            String inpString = scn.next();
            System.out.print((String)anchor.performAction(inpString) );
        } else if (inputZero ==2) {
            anchor = (n) -> {
                int result = 1;
                for(int i = 1; i <= n; ++i) {
                    result *= i;
                }
                return result;
            };
            int inputInt = scn.nextInt();
            System.out.print();


        }
    }
}

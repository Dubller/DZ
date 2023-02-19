package Card;


public class MyMain {
    public static void main (String[] args) {
        CreditCard card1 = new CreditCard (123, 500);
        CreditCard card2 = new CreditCard (321, 1000);
        CreditCard card3 = new CreditCard (231, 1500);
        card1.addSum(7);
        card2.addSum(5);
        card3.takeOff(2); // забираем 2 копеечки
        card1.infoCard();
        card2.infoCard();
        card3.infoCard();
    }
}
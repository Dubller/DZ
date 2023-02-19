package Card;


public class MyMain {
    public static void main (String[] args) {
        CreditCard card1 = new CreditCard (123, 500);
        CreditCard card2 = new CreditCard (321, 1000);
        CreditCard card3 = new CreditCard (231, 1500);
        card1.addSum(7); // доавляем 7 единиц
        card2.addSum(5); // добавляем 5 единиц
        card3.takeOff(2); // забираем 2 единиц
        card1.infoCard(); // отображение номера карты, и его остатка
        card2.infoCard(); //
        card3.infoCard(); //
    }
}
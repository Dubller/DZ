package Card;


// 1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.

public class CreditCard {
    int accNum;
    int cardSum;

    // Конструктор инфомрации о счёте
    public CreditCard(int cardAccNum, int cardCCurrentSum) {

        accNum = cardAccNum;
        cardSum = cardCCurrentSum;
    }


    //Информация о карте, и текущий счёт
    public void infoCard() {
        System.out.println("Текущая карта: " + accNum);
        System.out.println("Текущий счёт: " + cardSum);
        System.out.println();
    }

    public void takeOff(int cardSum0) {
        if (cardSum0 > cardSum) {
            cardSum = 0;
        } else {
            cardSum -= cardSum0;
        }

    }


    public void addSum(int cardSum1) {
        cardSum += cardSum1;
    }

}
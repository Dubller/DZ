package DZ13_1.FunkcionalMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dayOfWeek {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Введите дату интересующего Вас дня в формате число.месяц.год: ");
          String inpDate = scanner.next();
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
          Date dayWeek = null;
          try {
              dayWeek = simpleDateFormat.parse(inpDate);
          } catch (ParseException e) {
              System.out.print("Неверный ввод даты!");
          }
          System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
      }
}

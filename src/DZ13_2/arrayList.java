package DZ13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1,5,6,3,2,4,5,6,7,8,765,4,3,44,5,5,5,66,-32,2,-5,-5,1));
        System.out.println("Введенные значения: " + values);
        System.out.println("Без дубликатов: "+ values.stream().distinct().collect(Collectors.toList()));
        System.out.println("Четные числа в диапозоне от 7 до 17: "+ values.stream().filter(x ->x%2 == 0&&x>=7 && x<=17)
                .collect(Collectors.toList()));
        System.out.println("Каждое число умноженное на 2: "+ values.stream().map(x -> x*2).collect(Collectors.toList()));
        System.out.println("Отсортированные первых 4 элемента: "+ values.stream().sorted().limit(4).collect
                (Collectors.toList()));
        System.out.println("Колличество элементов в стриме: "+ values.stream().count());
        System.out.println("Среднее арифметическое всех чисел в стриме: "+ values.stream().mapToInt(x->x).average()
                .getAsDouble());


    }
}

/*
Напишите функцию, которая вычисляет сверхурочную работу и оплату, связанную
с сверхурочной работой.
Работа с 9 до 5: обычные часы работы
После 5 вечера это сверхурочная работа
Ваша функция получает массив с 4 значениями:
– Начало рабочего дня, в десятичном формате, (24-часовая дневная нотация)
– Конец рабочего дня. (Тот же формат)
– Почасовая ставка
– Множитель сверхурочных работ
Ваша функция должна возвращать:
$ + заработанные в тот день (округлены до ближайшей сотой)
 */

import java.util.*;

public class Number4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Начало рабочего дня: ");
        double start = Double.parseDouble(input.nextLine());
        System.out.printf("Конеч рабочего дня: ");
        double end = Double.parseDouble(input.nextLine());
        System.out.printf("Почасовая ставка: ");
        double salary = Double.parseDouble(input.nextLine());
        System.out.printf("Множитель сверхурочный работ: ");
        double overtimeSalary = Double.parseDouble(input.nextLine());
        System.out.println(overTime(start, end, salary, overtimeSalary));
    }


    public static String overTime(double start, double end, double salary, double overtimeSalary) {
        String money = "$";
        if (end > 17) return money + String.valueOf((17 - start) * salary + (end - 17) * salary * overtimeSalary);
        return money + String.valueOf((end-start) * salary);
    }
}

/*
Как указано в онлайн-энциклопедии целочисленных последовательностей: Гексагональная решетка -
это привычная двумерная решетка, в которой каждая точка имеет 6 соседей.
Центрированное шестиугольное число - это центрированное фигурное число,
представляющее шестиугольник с точкой в центре и всеми другими точками,
окружающими центральную точку в шестиугольной решетке.

Напишите функцию, которая принимает целое число n и возвращает "недопустимое",
если n не является центрированным шестиугольным числом или его иллюстрацией
в виде многострочной прямоугольной строки в противном случае.
 */

import java.util.*;

public class Number10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Число: ");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Результат: ");
        System.out.println(hexLattice(num));
    }


    public static String hexLattice(int num) {
        if (num % 6 != 1) return "Недоступно";
        if (num == 1) return "o";
        int levels = 1;
        int i = 0;
        String result = "";
        while (levels != num) {
            levels += 6 * i;
            i++;
        }
        for (int k = i; k <= 2 * i - 1; k++) {
            for (int j = k; j < 2 * i - 1; j++) {
                result += " ";
            }
            for (int j = 0; j < k; j++) {
                result += "o ";
            }
            result += "\n";
        }
        for (int k = 2 * i - 2; k >= i; k--) {
            for (int j = k; j < 2 * i - 1; j++) {
                result += " ";
            }
            for (int j = 0; j < k; j++) {
                result += "o ";
            }
            result += "\n";
        }
        return String.valueOf(result);
    }
}

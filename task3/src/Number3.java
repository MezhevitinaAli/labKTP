/*
Создайте функцию, которая проверяет, является ли целое число совершенным числом или нет.
Совершенное число - это число, которое можно записать как сумму его множителей, исключая само число.
Например, 6-это идеальное число, так как 1 + 2 + 3 = 6, где 1, 2 и 3-Все коэффициенты 6.
Точно так же 28-это совершенное число, так как 1 + 2 + 4 + 7 + 14 = 28.
 */
public class Number3 {
    public static void main(String[] args) {
        System.out.println(checkPerfect(Integer.parseInt(args[0])));
    }
    public static boolean checkPerfect(int numb) {
        int sumch = 0;
        for (int i = 1; i < numb; i++) {
            if (numb % i == 0) {
                sumch += i;
            }
            if (sumch > numb) {
                return false;
            }
        }
        return (sumch == numb);
    }
}

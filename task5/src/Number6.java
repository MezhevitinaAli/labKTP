/*
Создайте функцию, которая принимает число в качестве аргумента и возвращает true,
если это число является действительным номером кредитной карты,
а в противном случае-false. Номера кредитных карт должны быть длиной от 14 до 19 цифр
и проходить тест Луна, описанный ниже: – Удалите последнюю цифру (это"контрольная цифра").
 – Переверните число. – Удвойте значение каждой цифры в нечетных позициях.
Если удвоенное значение имеет более 1 цифры, сложите цифры вместе (например, 8 x 2 = 16 ➞ 1 + 6 = 7).
 – Добавьте все цифры. – Вычтите последнюю цифру суммы (из шага 4) из 10.
Результат должен быть равен контрольной цифре из Шага 1.
 */
public class Number6 {
    public static void main(String[] args) {
        System.out.println(validateCard(args[0]));
    }


    public static boolean validateCard(String card) {
        if (card.length() < 14 || card.length() > 19) return false;
        int checkNumber = Integer.parseInt(String.valueOf(card.charAt(card.length() - 1)));
        int longNumberSum = 0;
        int currentNumber = 0;
        int sum = 0;
        String sumString = "";
        for (int i = card.length() - 2; i >= 0; i--) {
            if (i % 2 == 0) currentNumber = Integer.parseInt(String.valueOf(card.charAt(i))) * 2;
            else currentNumber = Integer.parseInt(String.valueOf(card.charAt(i)));
            if (currentNumber > 9) {
                longNumberSum = 0;
                for (char c: String.valueOf(currentNumber).toCharArray()) {
                    longNumberSum += Integer.parseInt(String.valueOf(c));
                }
                sum += longNumberSum;
                continue;
            }
            sum += currentNumber;
        }
        sumString = String.valueOf(sum);
        return (10 - Integer.parseInt(String.valueOf((sumString.charAt(sumString.length() - 1)))) == checkNumber);
    }
}

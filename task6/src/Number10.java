/*
Число может не быть палиндромом, но его потомком может быть.
Прямой потомок числа создается путем суммирования каждой пары соседних цифр,чтобы создать цифры следующего числа.
Например, 123312 – это не палиндром, а его следующий потомок 363, где: 3 = 1 + 2; 6 = 3 + 3; 3 = 1 + 2.

Создайте функцию, которая возвращает значение true, если само число является палиндромом
или любой из его потомков вплоть до 2 цифр (однозначное число - тривиально палиндром).

Примечание: – Числа всегда будут иметь четное число цифр.
 */
import java.util.*;

public class Number10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(palindromeDescendant(number));
    }
    public static boolean palindromeDescendant(int number) {
        String a = Integer.toString(number);
        String b = "";
        for(int i = 0; i < a.length(); i++) {
            b = a.charAt(i) + b;
        }
        for(int i = 0; a.length() >= 2; i++){
            if(a.equals(b))
                return true;
            a = "";
            for(int y = b.length() - 1; y > 0; y = y - 2){
                a += Character.getNumericValue(b.charAt(y)) + Character.getNumericValue(b.charAt(y - 1));
            }
            b = "";
            for(int x = 0; x < a.length(); x++) {
                b = a.charAt(x) + b;
            }
        }
        return false;
    }
}

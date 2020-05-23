/*
Почтовые индексы состоят из 5 последовательных цифр.
Учитывая строку, напишите функцию, чтобы определить, является ли вход действительным почтовым индексом.
Действительный почтовый индекс выглядит следующим образом:
  – Должно содержать только цифры (не допускается использование нецифровых цифр).
  – Не должно содержать никаких пробелов.
  – Длина не должна превышать 5 цифр.
 */
public class Number7 {
    public static void main(String[] args) {
        String zip = args[0];
        System.out.println(isValid(zip));
    }
    public static boolean isValid(String zip) {
        if (zip.length() != 5) {
            return false;
        }
        try {
            int number = Integer.parseInt(zip);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}

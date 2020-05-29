/*
Входная строка может быть завершена, если можно добавить дополнительные буквы,
и никакие буквы не должны быть удалены, чтобы соответствовать слову.
Кроме того, порядок букв во входной строке должен быть таким же,
как и порядок букв в последнем слове. Создайте функцию, которая, учитывая входную строку,
определяет, может ли слово быть завершено.
 */
import java.util.*;

public class Number3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Shortcut: ");
        String shortw = input.nextLine();
        System.out.printf("Word: ");
        String longw = input.nextLine();
        System.out.println(canComplete(shortw, longw));
    }


    public static boolean canComplete(String shortw, String longw) {
        boolean exists = false;
        for (char c: shortw.toCharArray()) {
            exists = false;
            for (int i = 0; i < longw.length(); i++) {
                if (c == longw.charAt(i)) {
                    longw = longw.substring(i + 1);
                    exists = true;
                    break;
                }
            }
            if (exists == false) return false;
        }
        return true;
    }
}

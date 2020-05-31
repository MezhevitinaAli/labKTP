/*
Учитывая параметры RGB (A) CSS, определите, является ли формат принимаемых значений допустимым или нет.
Создайте функцию, которая принимает строку (например, " rgb(0, 0, 0)") и возвращает true, если ее формат правильный,
в противном случае возвращает false.
 */
import java.util.*;
import java.util.regex.*;

public class Number3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value: ");
        String col = input.nextLine();
        System.out.printf("Result: %s", validColor(col));
    }
    public static String rgb = "rgb\\(([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\)";
    public static String rgba = "rgba\\(([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,[0-1]\\)";

    public static boolean validColor(String col) {
        if (Pattern.matches(rgb, col)) return true;
        if (Pattern.matches(rgba, col)) return true;
        return false;
    }
}

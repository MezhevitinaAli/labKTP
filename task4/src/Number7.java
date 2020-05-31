/*
Напишите функцию, которая преобразует строку в звездную стенографию. Если
символ повторяется n раз, преобразуйте его в символ*n.
 */
import java.util.*;

public class Number7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input: ");
        String string = input.nextLine();
        System.out.println(toStarShorthand(string));
    }


    public static String toStarShorthand(String input) {
        String result = "";
        int count = 1;
        char currentChar = new Character('a');
        for (int i = 1; i < input.length(); i++) {
            currentChar = input.charAt(i - 1);
            if (currentChar == input.charAt(i)) count++;
            else {
                if (count > 1) result += currentChar + "*" + count;
                else result += currentChar;
                count = 1;
                if (i == input.length() - 1) result += String.valueOf(input.charAt(input.length() - 1));
            }
        }
        if (count != 1) result += currentChar + "*" + count;
        return result;
    }
}
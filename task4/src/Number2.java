//Напишите функцию, которая группирует строку в кластер скобок. Каждый кластер
//должен быть сбалансирован.
import java.util.*;

public class Number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("String: ");
        String text = input.nextLine();
        System.out.println(split(text));
    }


    public static List<String> split(String text) {
        List<String> result = new ArrayList<String>();
        int balance = 0;
        String current = "";
        for (char ch: text.toCharArray()) {
            if (Character.toString(ch).equals("(")) {
                balance++;
                current += "(";
            }
            else {
                balance--;
                current += ")";
            }
            if (balance == 0) {
                result.add(current);
                current = "";
            }
        }
        return result;
    }
}

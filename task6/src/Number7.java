import java.util.*;
/*
Напишите функцию, которая возвращает самую длинную неповторяющуюся подстроку для строкового ввода.

Примечание:
– Если несколько подстрок связаны по длине, верните ту, которая возникает первой.
 */
public class Number7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String w = input.nextLine();
        System.out.printf("Result: %s", longestNonrepeatingSubstring(w));
    }
    public static String longestNonrepeatingSubstring(String w) {
        ArrayList<String> uniques = new ArrayList<String>();
        String curStr = "";
        String curChar;
        int indexMax = 0;
        for (char c: w.toCharArray()) {
            curChar = String.valueOf(c);
            if (curStr.indexOf(curChar) != -1) {
                uniques.add(curStr);
                curStr = curChar;
                continue;
            }
            curStr += curChar;
        }
        if (curStr.length() != 0) {
            uniques.add(curStr);
        }
        for (int i = 0; i < uniques.size(); i++) {
            if (uniques.get(indexMax).length() < uniques.get(i).length()) {
                indexMax = i;
            }
        }
        return uniques.get(indexMax);
    }
}

/*
Создайте функцию, которая возвращает true, если две строки рифмуются, и false в
противном случае. Для целей этого упражнения две строки рифмуются, если
последнее слово из каждого предложения содержит одни и те же гласные.
Примечание:
– Без учета регистра.
– Здесь мы не обращаем внимания на такие случаи, как "thyme" и "lime".
– Мы также игнорируем такие случаи, как "away" и "today"
(которые технически рифмуются, хотя и содержат разные гласные).
 */
import java.util.*;

public class Number8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Первая строка: ");
        String n = input.nextLine();
        System.out.printf("Последняя: ");
        String m = input.nextLine();
        System.out.println(doesRhyme(n, m));
    }


    public static boolean doesRhyme(String f, String s) {
        String[] words1 = f.split(" ");
        String word1 = words1[words1.length - 1];
        String[] words2 = s.split(" ");
        String word2 = words2[words2.length - 1];
        String vowels = "EeAaUuIiOoYy";
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();
        boolean eq = true;
        for (char ch: vowels.toCharArray()) {
            String c = String.valueOf(ch);
            if (word1.indexOf(c) != -1) {
                first.add(c.toLowerCase());
            }
            if (word2.indexOf(c) != -1) {
                second.add(c.toLowerCase());
            }
        }
        if (first.size() != second.size()) return false;
        for (int i = 0; i < first.size(); i++) {
            if (eq) {
                eq = false;
                for (int j = 0; j < second.size(); j++) {
                    if (second.get(j).equals(first.get(i))) eq = true;
                }
            }
        }
        return eq;
    }
}

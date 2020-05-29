/*
Напишите функцию, которая выбирает все слова, имеющие все те же гласные
(в любом порядке и / или количестве), что и первое слово, включая первое слово.
 */
import java.util.*;

public class Number5 {
    public static void main(String[] n) {
        System.out.println(sameVowelGroup(n));
    }


    public static List<String> sameVowelGroup(String[] n) {
        String[] allowed = new String[] {"A", "E", "Y", "U", "I", "O"};
        List<String> list = Arrays.asList(allowed);
        List<String> result = new ArrayList<String>();
        String first = n.length > 0 ? n[0] : "";
        boolean good = false;
        for (String str: n) {
            for (char f: first.toCharArray()) {
                if (list.contains(String.valueOf(f).toUpperCase())) {
                    for (char s: str.toCharArray()) {
                        if (s == f) {
                            good = true;
                            break;
                        }
                        good = false;
                    }
                }
            }
            if (good) result.add(str);
        }
        return result;
    }
}

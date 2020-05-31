/*
В «поросячей латыни» (свинский латинский) есть два очень простых правила:
 – Если слово начинается с согласного, переместите первую букву (буквы) слова до гласного
   до конца слова и добавьте «ay» в конец.
have ➞ avehay cram ➞ amcray take ➞ aketay cat ➞ atcay shrimp ➞ impshray trebuchet ➞ ebuchettray
 – Если слово начинается с гласной, добавьте "yay" в конце слова.
ate ➞ ateyay apple ➞ appleyay oaken ➞ oakenyay eagle ➞ eagleyay

Примечание:
– Регулярные выражения помогут вам не исказить пунктуацию в предложении.
– Если исходное слово или предложение начинается с заглавной буквы, перевод должен сохранить свой регистр
 */
import java.util.*;

public class Number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a word or sentence to translate: ");
        String word = input.nextLine();
        System.out.printf("Translate: %s\n", translateWord(word));
    }


    public static String translateWord(String word) {
        String[] words = word.split(" ");
        String result = "";
        String vowels = "EeAaUuIiOoYy";
        String charactes = "!@#$%%^&*()<>,./?;:'\"[{}]_-+=";
        String stringStart = "";
        WORDS:
        for (String sl: words) {
            for (char c: vowels.toCharArray()) {
                if (sl.charAt(0) == c) {
                    sl += "yay";
                    result += sl + " ";
                    continue WORDS;
                }
            }
            stringStart = "";
            CHARS:
            for (char c: sl.toCharArray()) {
                for (char ch: vowels.toCharArray()) {
                    if (c == ch) break CHARS;
                }
                stringStart += String.valueOf(c);
            }
            result += sl.replace(stringStart, "") + stringStart + "ay" + " ";
            for (char c: sl.toCharArray()) {
                for (char ch: charactes.toCharArray()) {
                    if (c == ch) result = result.trim().replace(String.valueOf(c), "") + c + " ";
                }
            }
        }
        return result.trim();
    }
}

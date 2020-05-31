import java.util.*;
import java.util.regex.*;
/*
Напишите функцию, которая извлекает три самых длинных слова из заголовка газеты и преобразует их в хэштеги.
Если несколько слов одинаковой длины, найдите слово, которое встречается первым.

Примечание:
– Если заголовок содержит менее 3 слов, просто расположите слова в заголовке по длине в порядке убывания.
– Пунктуация не считается с длиной слова.
 */
public class Number5 {
    public static Pattern textPattern = Pattern.compile("[a-zA-Z]+");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a header: ");
        String tag = input.nextLine();
        System.out.printf("Result: %s", getHashTags(tag));
    }
    public static List<String> getHashTags(String tag) {
        List<String> result = new ArrayList<String>();
        Matcher matcher;
        String maximumWord = "";
        int indexMax = -1;
        int i = 0;
        List<String> hashtags = new ArrayList<String>();
        matcher = textPattern.matcher(tag);
        while (matcher.find()) {
            hashtags.add(matcher.group().toLowerCase());
        }
        System.out.println(hashtags);
        while (i < 3 && hashtags.size() != 0) {
            maximumWord = "";
            for (int j = 0; j < hashtags.size(); j++) {
                if (hashtags.get(j).length() > maximumWord.length()) {
                    maximumWord = hashtags.get(j);
                    indexMax = j;
                }
            }
            hashtags.remove(indexMax);
            result.add("#" + maximumWord);
            i++;
        }
        return result;
    }
}

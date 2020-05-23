/*
Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
– В противном случае верните false.
 */

public class Number9 {
    public static void main(String[] args) {
        if (Character.toString(args[1].charAt(0)).equals("-")){
            System.out.println(isSuffix(args[0], args[1]));
        }
        else {
            System.out.println(isPrefix(args[0], args[1]));
        }
    }
    public static boolean isPrefix(String word, String prefix) {
        prefix = prefix.replace("-", "");
        for (int i = 0; i < prefix.length(); i++) {;
            if (prefix.charAt(i) == word.charAt(i)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static boolean isSuffix(String word, String suffix) {
        suffix = suffix.replace("-", "");
        int diff = word.length() - suffix.length();
        for (int i = diff; i < word.length(); i++) {
            if (suffix.charAt(i - diff) == word.charAt(i)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}

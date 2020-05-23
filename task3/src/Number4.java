/*
Создайте функцию, которая принимает строку и возвращает новую строку
с заменой ее первого и последнего символов, за исключением трех условий:
 – Если длина строки меньше двух, верните "несовместимо".".
 – Если первый и последний символы совпадают, верните "два-это пара.".
 */
public class Number4 {
    public static void main(String[] args) {
        System.out.println(flipEndChars(args[0]));
    }
    public static String flipEndChars(String str){
        if (str.length() <= 2) {
            return "Несовместимо.";
        }
        if (str.charAt(0) == str.charAt(str.length()-1)){
            return "Два - это пара.";
        }
        char one = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        char [] chars = str.toCharArray();
        chars[0] = last;
        chars[str.length() - 1] = one;
        return String.valueOf(chars);
    }
}


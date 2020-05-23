/*
Пара строк образует странную пару, если оба из следующих условий истинны:
– Первая буква 1-й строки = последняя буква 2-й строки.
– Последняя буква 1-й строки = первая буква 2-й строки.
– Создайте функцию, которая возвращает true, если пара строк представляет собой странную пару,
и false в противном случае.

 */
public class Number8 {
    public static void main(String[] args) {
        System.out.println(isStrangePair(args[0], args[1]));
    }
    public static boolean isStrangePair(String first, String second) {
        if (second.charAt(0) == first.charAt(first.length() - 1) && second.charAt(second.length() - 1) == first.charAt(0)) {
            return true;
        }
        return false;
    }
}
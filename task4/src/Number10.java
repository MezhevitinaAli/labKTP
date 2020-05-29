/*
Предположим, что пара одинаковых символов служит концами книги для всех
символов между ними. Напишите функцию, которая возвращает общее количество
уникальных символов (книг, так сказать) между всеми парами концов книги.
Эта функция будет выглядеть следующим образом:
countUniqueBooks("stringSequence", "bookEnd")
 */

import java.util.*;

public class Number10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("String: ");
        String st = input.nextLine();
        System.out.printf("Book end: ");
        Character bookEnd = input.nextLine().charAt(0);
        System.out.println(countUniqueBook(st, bookEnd));
    }


    public static int countUniqueBook(String book, Character end) {
        Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
        boolean parse = false;
        for (char c: book.toCharArray()) {
            if (parse && c != end) chars.put(c, true);
            if (c == end) {
                if (parse) parse = false;
                else parse = true;
            }
        }
        System.out.println(chars);
        return chars.size();
    }
}
/*
Напишите функцию, которая возвращает позицию второго вхождения " zip " в строку, или -1,
если оно не происходит по крайней мере дважды.
Ваш код должен быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может произойти в строке.
 */

public class Number2 {
    public static void main(String[] args) {
        String poz = "";
        for (int i = 0; i < args.length; i++) {
            poz += args[i] + " ";
        }
        System.out.println(findZip(poz));
    }
    public static int findZip(String poz) {
        if (poz.indexOf("zip") != -1 && poz.lastIndexOf("zip") != poz.indexOf("zip")) {
            return poz.lastIndexOf("zip");
        }
        return -1;
    }
}
/*
Создайте функцию, которая возвращает число десятичных знаков, которое имеет число (заданное в виде строки).
Любые нули после десятичной точки отсчитываются в сторону количества десятичных знаков.
 */
public class Number5 {
    public static void main(String[] args) {

        System.out.println(getDecimalPlaces(args[0]));
    }


    public static int getDecimalPlaces(String str) {
        String[] sp = str.split("\\.");
        return sp[1].length();
    }
}

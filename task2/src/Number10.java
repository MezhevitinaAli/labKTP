/* Создайте функцию, которая принимает число (шаг) в качестве аргумента
и возвращает количество полей на этом шаге последовательности. */

public class Number10 {
    public static void main(String[] args) {
        System.out.println(boxSeq(Integer.parseInt(args[0])));
    }
    public static int boxSeq(int number) {
        if (number % 2 == 0) {
            return number;
        }
        return number + 2;
    }
}

/*
Создайте функцию, которая при заданном числе возвращает соответствующее число Фибоначчи.
 */
public class Number6 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(Fibonacci(number));
    }
    public static int Fibonacci(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }
}

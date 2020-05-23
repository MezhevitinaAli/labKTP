/*
Если задано целое число, создайте функцию, которая возвращает следующее простое число.
Если число простое, верните само число.
 */
public class Number9 {
    public static void main(String[] args) {
        System.out.println(nextPrime(Integer.parseInt(args[0])));
    }


    public static int nextPrime(int number) {
        boolean isPrime = true;
        int next = number;
        while (true) {
            isPrime = true;
            for (int i = 2; i < next - 1; i++) {
                if (next % i == 0) isPrime = false;
            }
            if (isPrime) return next;
            next++;
        }
    }
}

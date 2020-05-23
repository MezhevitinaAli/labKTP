/*
Создайте метод, который берет массив целых чисел и возвращает массив,
в котором каждое целое число является суммой самого себя + всех предыдущих чисел в массиве.
 */

public class Number4 {
    public static void main(String[] args) {
        int[] Numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            Numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(cumulativeSum(Numbers));
    }
    public static String cumulativeSum(int[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            int result = arr[i];
            for (int j = 0; j < i; j++) {
                result += arr[j];
            }
            answer += result + " ";
        }
        return answer;
    }
}

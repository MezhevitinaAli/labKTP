/*
Создайте функцию, которая принимает массив и возвращает разницу между самыми большими и самыми маленькими числами.
 */
public class Number2 {
    public static void main(String[] args) {
        int[] Numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            Numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(differenceMaxMin(Numbers));
    }
    public static int differenceMaxMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }
}


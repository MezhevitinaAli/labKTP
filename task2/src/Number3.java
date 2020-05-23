/*
Создайте функцию, которая принимает массив в качестве аргумента и возвращает true или false
 в зависимости от того, является ли среднее значение всех элементов массива целым числом или нет.
 */
public class Number3 {
    public static void main(String[] args) {
        int[] Numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            Numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(isAvgWhole(Numbers));
    }
    public static boolean isAvgWhole(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return (result % arr.length == 0);
    }
}

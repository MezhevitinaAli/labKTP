/*
Число Белла - это количество способов, которыми массив из n элементов может быть разбит на непустые подмножества.
Создайте функцию, которая принимает число n и возвращает соответствующее число Белла.
 */
import java.util.*;

public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Длинна массива: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.printf("Число Белла: %s\n", bell(n));
    }
    public static int bell(int n) {
        int[][] mas = new int[n + 1][n + 1];
        mas[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            mas[i][0] = mas[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                mas[i][j] = mas[i - 1][j - 1] + mas[i][j - 1];
            }
        }
        return mas[n][0];
    }
}

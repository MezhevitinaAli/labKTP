/*
Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2
различных решения для действительных значений x. учитывая a, b и c,
вы должны вернуть число решений в уравнение
 */
public class Number1 {
    public static void main(String[] args) {
        int[] N = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            N[i] = Integer.parseInt(args[i]);
        }
        System.out.println(solutions(N[0], N[1], N[2]));
    }
    public static int solutions(int a, int b, int c) {
        double result = Math.pow(b, 2) - 4 * a * c;
        if (result > 0) {
            return 2;
        }
        else if (result == 0) {
            return 1;
        }
        return 0;
    }
}

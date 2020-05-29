/*
Создайте функцию, которая принимает числа в качестве аргументов,
складывает их вместе и возвращает произведение цифр до тех пор,
пока ответ не станет длиной всего в 1 цифру.
 */

public class Number4 {
    public static void main(String[] n) {
        System.out.println(sumDigProd(n));
    }
    public static int sumDigProd(String... n) {
        int[] nums = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            nums[i] = Integer.parseInt(n[i]);
        }
        int count = 0;
        int multi = 1;
        for (int num: nums) {
            count += num;
        }
        for (char c: String.valueOf(count).toCharArray()) {
            multi *= c - '0';
        }
        if (String.valueOf(multi).length() == 1) return multi;
        return sumDigProd(String.valueOf(multi));
    }
}

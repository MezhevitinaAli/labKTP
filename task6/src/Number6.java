import java.util.*;

/*
Последовательность Улама начинается с: ulam = [1, 2]
Следующее число в последовательности - это наименьшее положительное число, равное сумме двух разных чисел
(которые уже есть в последовательности) ровно одним способом. Тривиально, это 3, так как в стартовой последовательности
есть только 2 числа.  ulam = [1, 2, 3]

Следующее число 4, которое является суммой 3 + 1. 4 также равно 2 + 2,
но это уравнение не учитывается, так как 2 добавления должны быть различны.
ulam = [1, 2, 3, 4]

Следующее число не может быть 5, так как 5 = 1 + 4, но также и 5 = 2 + 3.
Должен быть только один способ сделать число Улама из 2 различных добавлений,
найденных в последовательности. Следующее число 6 (2 + 4).
Есть 2 способа сделать 7 (1 + 6 или 3 + 4), поэтому следующий - 8 (2 + 6). И так далее.
ulam = [1, 2, 3, 4, 6, 8, 11, 13, 16, 18, 26, 28, 36, 38, 47, 48, 53, …]

Создайте функцию, которая принимает число n и возвращает n-е число в последовательности Улама.
 */
public class Number6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        Integer ch = Integer.parseInt(input.nextLine());
        System.out.println(ulam(ch));
    }
    public static Integer ulam(Integer ch) {
        List<Integer> ulam2 = new ArrayList<Integer>();
        ulam2.add(1);
        ulam2.add(2);
        int next = ulam2.get(ulam2.size() - 1) + 1;
        int count;
        while (ulam2.size() != ch) {
            count = 0;
            for (int i = 0; i < ulam2.size() - 1; i++) {
                for (int j = i + 1; j < ulam2.size(); j++) {
                    if (ulam2.get(i) + ulam2.get(j) == next)
                        count++;
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1) ulam2.add(next);
            next++;
        }
        return ulam2.get(ch - 1);
    }
}

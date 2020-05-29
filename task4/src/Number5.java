/*
Индекс массы тела (ИМТ) определяется путем измерения вашего веса в
килограммах и деления на квадрат вашего роста в метрах. Категории ИМТ таковы:
Недостаточный вес: <18,5
Нормальный вес: 18.5-24.9
Избыточный вес: 25 и более
Создайте функцию, которая будет принимать вес и рост (в килограммах, фунтах,
метрах или дюймах) и возвращать ИМТ и связанную с ним категорию. Округлите
ИМТ до ближайшей десятой.
 */

import java.util.*;

public class Number5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Mass: ");
        String m = input.nextLine();
        System.out.printf("Height: ");
        String h = input.nextLine();
        System.out.println(BMI(m, h));
    }


    public static String BMI(String m, String h) {
        double mass = 0;
        double height = 0;
        Map<String, Double> metrics = new HashMap<String, Double>();
        metrics.put("pounds", 2.205);
        metrics.put("kilos", 1.0);
        metrics.put("inches", 39.37);
        metrics.put("meters", 1.0);
        for (Map.Entry<String,Double> entry: metrics.entrySet()) {
            if (m.indexOf(entry.getKey()) != -1) {
                mass = Double.parseDouble(m.replace(entry.getKey(), "").trim()) / entry.getValue();
            }
            if (h.indexOf(entry.getKey()) != -1) {
                height = Double.parseDouble(h.replace(entry.getKey(), "").trim()) / entry.getValue();
            }
        }
        double res = mass / Math.pow(height, 2);
        if (res < 18.5) return String.format("%.1f", res) + " Underweight";
        else if (res >= 18.5 && res < 24.9) return String.format("%.1f", res) + " Normal weight";
        return String.format("%.1f", res) + " Overweight";
    }
}

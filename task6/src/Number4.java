

/*
Создайте функцию, которая принимает URL (строку), удаляет дублирующиеся параметры запроса и параметры,
указанные во втором аргументе (который будет необязательным массивом).

Примечание:
– Второй аргумент paramsToStrip является необязательным.
– paramsToStrip может содержать несколько параметров.
– Если есть повторяющиеся параметры запроса с разными значениями, используйте
значение последнего встречающегося параметра.
 */
import java.util.*;

public class Number4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a link: ");
        String link = input.nextLine();
        System.out.printf("Parameter: ");
        String[] par = input.nextLine().split(" ");
        if (par.length > 0) {
            System.out.printf("Result is: %s", stripUrlParams(link, par));
        }
        else {
            System.out.printf("Result: %s", stripUrlParams(link));
        }
    }
    public static String stripUrlParams(String link, String... args) {
        String result = "";
        Map<String, String> par = new HashMap<String, String>();
        if (link.split("\\?").length == 1)
            return link;
        String[] urlparams = link.split("\\?")[1].split("\\&");
        PARAMS:
        for (String param: urlparams) {
            String key = param.split("\\=")[0];
            String value = param.split("\\=")[1];
            for (String arg: args) {
                if (arg.equals(key))
                    continue PARAMS;
            }
            par.put(key, value);
        }
        for (Map.Entry<String, String> entry: par.entrySet()) {
            result += entry.getKey() + "=" + entry.getValue() + " ";
        }
        return link.split("\\?")[0] + "?" + result.trim().replace(" ", "&");
    }
}

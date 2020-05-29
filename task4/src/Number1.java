//Бесси работает над сочинением для своего класса писателей. Поскольку ее почерк
//довольно плох, она решает напечатать эссе с помощью текстового процессора.
//Эссе содержит N слов (1≤N≤100), разделенных пробелами. Каждое слово имеет
//длину от 1 до 15 символов включительно и состоит только из прописных или
//строчных букв. Согласно инструкции к заданию, эссе должно быть
//отформатировано очень специфическим образом: каждая строка должна содержать
//не более K (1≤K≤80) символов, не считая пробелов. К счастью, текстовый
//процессор Бесси может справиться с этим требованием, используя следующую
//стратегию:
//– Если Бесси набирает Слово, и это слово может поместиться в текущей строке, поместите
//его в эту строку. В противном случае поместите слово на следующую строку и
//продолжайте добавлять к этой строке. Конечно, последовательные слова в одной строке
//все равно должны быть разделены одним пробелом. В конце любой строки не должно
//быть места.
//– К сожалению, текстовый процессор Бесси только что сломался. Пожалуйста,
//помогите ей правильно оформить свое эссе!
import java.util.*;

public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("N: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.printf("K: ");
        int k = Integer.parseInt(input.nextLine());
        System.out.printf("String: ");
        String text = input.nextLine();
        System.out.println(essay(n, k, text));
    }


    public static String essay(int n, int k, String text) {
        String[] words = text.split(" ");
        String currentString = "";
        String result = "";
        boolean added = false;
        if (n > words.length) return "Сan't create essay with this parameters";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (currentString.replace(" ", "").length() + word.length() <= k) currentString += word + " ";
            else {
                result += currentString + "\n";
                currentString = word + " ";
            }
        }
        if (currentString.length() > 0) {
            result += currentString + "\n";
        }
        return result;
    }
}

/*
Хеш-алгоритмы легко сделать одним способом, но по существу невозможно сделать наоборот.
Например, если вы хешируете что-то простое, например, password123,
это даст вам длинный код, уникальный для этого слова или фразы.
В идеале, нет способа сделать это в обратном порядке.
Вы не можете взять хеш-код и вернуться к слову или фразе, с которых вы начали. Создайте функцию,
которая возвращает безопасный хеш SHA-256 для данной строки.
Хеш должен быть отформатирован в виде шестнадцатеричной цифры.
 */
import java.util.*;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class Number8 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        System.out.printf("What do you want to hash?: ");
        String unhased = input.nextLine();
        System.out.println(getSha256Hash(unhased));
    }
    public static String getSha256Hash(String str) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashInBytes = md.digest(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}

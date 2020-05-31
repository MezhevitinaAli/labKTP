/*
 Создайте функцию, которая принимает строку и возвращает true или false в зависимости от того,
 является ли формула правильной или нет.
 */

import java.util.*;

public class Number9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the formula: ");
        String dig = input.nextLine();
        System.out.printf("Result: %s", formula(dig));
    }
    private static boolean formula(String str){
        int size = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ') size++;
        }
        String a[] = new String[size+1];
        Arrays.fill(a,"");
        size = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ') size++;
            else a[size] += str.charAt(i);
        }
        if(size > 4 || !(a[3].equals("=")))
            return false;
        try {
            int a1 = Integer.parseInt(a[0]);
            int a2 = Integer.parseInt(a[2]);
            int a3 = Integer.parseInt(a[4]);
            if (a[1].equals("+")) {
                return (a1 + a2) == a3;
            } else if (a[1].equals("-")) {
                return (a1 - a2) == a3;
            } else if (a[1].equals("*")) {
                return (a1 * a2) == a3;
            } else if (a[1].equals("/")) {
                return (a1 / a2) == a3;
            }
            else return false;
        } catch (Throwable e){
            return false;
        }
    }
}

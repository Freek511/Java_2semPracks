package prac1;

import java.util.Scanner;

public class ConsumerTest {
    public static void main(String[] args){

        Consumer consumer = (str)->{
            char [] chars = str.toCharArray();
            for(int i = 3; i < str.length(); i += 3) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            str = String.valueOf(chars);
            return str;
        };

        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        System.out.println(temp);
        System.out.println(consumer.toUpper(temp));

    }

    interface Consumer {
        String toUpper(String str);
    }
}

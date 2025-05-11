package programmers기초.문자열돌리기;

import java.util.Scanner;

public class Main20250518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        ;

        scanner.close();

    }

}
package programmers기초.덧셈식출력하기;

import java.util.Scanner;

public class Main20250518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + '+' + b + "=" + (a + b));

        scanner.close();

    }

}
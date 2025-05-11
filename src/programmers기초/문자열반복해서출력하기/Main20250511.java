package programmers기초.문자열반복해서출력하기;

import java.util.Scanner;

public class Main20250511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
            
        }
        System.out.println(result.toString());
    }
}

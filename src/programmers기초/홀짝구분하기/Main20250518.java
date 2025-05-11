package programmers기초.홀짝구분하기;

import java.util.Scanner;

public class Main20250518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n % 2 == 0) {
            System.out.println(n + " is even");
        }else {
            System.out.println(n + " is odd");
        }

        scanner.close();
    }

}
package programmers.직각삼각형출력하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120823
제한 시간: 30분
사용 시간: 30분 초
문제 접근 방식:  1.Scanner scanner = new Scanner(System.in);: 사용자 입력을 받기 위해 Scanner 객체를 생성
2.int n = scanner.nextInt();: 삼각형의 높이 입력.
3.for (int i = 1; i <= n; i++): 1부터 n까지 반복하면서 각 줄에 별을 출력
4.System.out.println("*".repeat(i));: repeat() 메서드를 사용해 i개의 *을 출력

*/
import java.util.Scanner;

public class Main20250208 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //테스트 코드
            int n = scanner.nextInt(3);

            // 직각 이등변 삼각형 출력
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // 줄 바꿈
            }

            scanner.close();
        }
    }


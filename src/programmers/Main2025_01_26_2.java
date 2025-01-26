package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120906
제한 시간: 30분
사용 시간: 5분
문제 접근 방식:
-while루프를 사용하여 풀어보자
*/

public class Main2025_01_26_2 {
    public int solution(int n) {
        int sum = 0;

        // n의 각 자릿수를 더함
        while (n > 0) {
            sum += n % 10; // 마지막 자릿수를 더함
            n /= 10;       // 마지막 자릿수를 제거
        }

        return sum;
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
       Main2025_01_26_2  sol = new Main2025_01_26_2();
        System.out.println(sol.solution(1234));    // 출력: 10
        System.out.println(sol.solution(930211)); // 출력: 16
    }
}
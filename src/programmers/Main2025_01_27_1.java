package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120906
제한 시간: 30분
사용 시간: 10분
문제 접근 방식:
-while루프를 사용하여 풀어보자
*/

public class Main2025_01_27_1 {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10; // n의 마지막 자리 숫자를 더함
            n /= 10;       // n을 10으로 나누어 마지막 자리 제거
        }

        return sum;
    }

    public static void main(String[] args) {
        Main2025_01_27_1 sol = new Main2025_01_27_1();

        // 테스트 코드
        System.out.println(sol.solution(1234));    // 10
        System.out.println(sol.solution(930211));  // 16
    }
}
package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120816
제한 시간: 30분
사용 시간: 5분
문제 접근 방식:
- n + slice - 1:
나누기 연산에서 올림을 하기 위해 사용하는 수식을 활용하여 풀자
*/

public class Main2025_01_25_1 {
    public int solution(int slice, int n) {
        // 필요한 피자 판 수를 계산
        return (n + slice - 1) / slice;
    }

    // 테스트용 main 함수
    public static void main(String[] args) {
        Main2025_01_25_1 sol = new Main2025_01_25_1();

        // 예제 테스트
        System.out.println(sol.solution(7, 10)); // 2
        System.out.println(sol.solution(4, 12)); // 3
    }
}

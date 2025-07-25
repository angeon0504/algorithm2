package programmers기초공배수;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법:
num % n == 0: number가 n의 배수인지 확인
num % m == 0: number가 m의 배수인지 확인
두 조건이 모두 참일 때만 1을 반환하고, 아니면 0을 반환
*/
public class Main20250725 {
    public int solution(int num, int n, int m) {
        if (num % n == 0 && num % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Main20250725 solution = new Main20250725();
        System.out.println(solution.solution(60, 2,3));  // 364 (✔)
        System.out.println(solution.solution(55, 10,5));  // 912 (✔)
    }
}


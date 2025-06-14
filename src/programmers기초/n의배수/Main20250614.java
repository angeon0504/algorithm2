package programmers기초.n의배수;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법:
num이 n의  배수이면 1를 반환시키게 하ㅏ기
*/
public class Main20250614 {
    public int solution(int num, int n) {

        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Main20250614 solution = new Main20250614();
        System.out.println(solution.solution(98, 2));  // 364 (✔)
        System.out.println(solution.solution(34, 3));  // 912 (✔)
    }
}


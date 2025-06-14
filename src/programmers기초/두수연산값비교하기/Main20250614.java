package programmers기초.두수연산값비교하기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법:
정수를 문자열로 바꾸고 더하기
Math.max(ab, ba): a ⊕ b와 b ⊕ a 중 큰 값을 선택
*/
public class Main20250614 {
    public int solution(int a, int b) {

        int opResult = Integer.parseInt("" + a + b);
        int mulResult = 2 * a * b;


        return Math.max(opResult, mulResult);
    }

    public static void main(String[] args) {
        Main20250614 solution = new Main20250614();
        System.out.println(solution.solution(2, 91));  // 364 (✔)
        System.out.println(solution.solution(91, 2));  // 912 (✔)
    }
}


package programmers기초.flag에따라다른값반환하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 20분
사용 시간: 5분 초
문제 해결방법:
ineq와 eq 조합에 따라 비교식을 구성합니다.
*/
public class Main20250725 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}

    public static void main(String[] args) {
        Main20250725 solution = new Main20250725();
        System.out.println(solution.solution("<", "=",20,50));  // 364 (✔)
        System.out.println(solution.solution(">", "!",41,78));  // 912 (✔)
    }
}


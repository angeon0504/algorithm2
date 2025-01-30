package programmers.피자나눠먹기1;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120814
제한 시간: 30분
사용 시간: 5분 13초
문제 접근 방식:
 */
class Main20250130 {
    public int solution(int n) {
        // 필요한 피자의 최소 판 수 계산
        return (n + 6) / 7;
    }

    public static void main(String[] args) {
        Main20250130 main20250130 = new Main20250130();

        // 테스트 코드
        System.out.println(main20250130.solution(7));  // 1
        System.out.println(main20250130.solution(1));  // 1
        System.out.println(main20250130.solution(15)); // 3
    }
}

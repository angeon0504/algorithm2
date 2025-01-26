package programmers;

/*
문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/120909
제한 시간: 30분
사용 시간: 5분
문제 접근 방식:
i * i <= n:

i를 1부터 증가시키면서 i * i가 n보다 작거나 같은 경우만 확인
이는 효율성을 높이는 조건으로, i가 √n보다 커지면 더 이상 확인할 필요가 없음
i * i == n:

i의 제곱이 n과 같다면 제곱수. 이 경우 1을 반환한다
루프 종료 후 2 반환:

루프가 종료될 때까지 제곱수를 찾지 못했다면, n은 제곱수가 아님
*/

public class Main2025_01_26_1 {
    public int solution(int n) {
        // 1부터 시작해 n까지의 숫자를 확인
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return 1; // 제곱수인 경우
            }
        }
        return 2; // 제곱수가 아닌 경우
    }

    // 테스트 코드
    public static void main(String[] args) {
        Main2025_01_26_1 sol = new Main2025_01_26_1()
        System.out.println(sol.solution(144)); // 출력: 1
        System.out.println(sol.solution(976)); // 출력: 2
    }
}
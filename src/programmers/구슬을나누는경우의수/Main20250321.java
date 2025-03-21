package programmers.구슬을나누는경우의수;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120840
제한 시간: 30분
사용 시간: 30분
문제해결방법:
C(n, r) = C(n, n-r) 성질을 이용해 작은 값으로 변환 → 연산량 절반 감소
result = result * (n - i) / (i + 1); 형태로 한 번에 계산
중간 과정에서 값이 너무 커지지 않도록 나눗셈을 즉시 적용
*/
public class Main20250321 {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }


    private int combination(int n, int r) {
        if (r > n - r) r = n - r;
        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }

    // 테스트 코드
    public static void main(String[] args) {
        Main20250321 solution = new Main20250321();
        System.out.println(solution.solution(3, 2));
        System.out.println(solution.solution(5, 3));
        System.out.println(solution.solution(30, 15));
    }
}













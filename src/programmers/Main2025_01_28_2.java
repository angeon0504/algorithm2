package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120849
제한 시간: 30분
사용 시간: 22분 37초
문제 접근 방식:반복 범위 최적화:1부터 루트 n까지 반복하여 모든 약수를 찾고
약수 i가 발견되면 (i, n/i)와 (n/i, i) 두 개의 순서쌍을 추가.
i * i == n인 경우(완전 제곱수)는 순서쌍이 중복을 제거
-

*/

public class Main2025_01_28_2 {
    public int solution(int n) {
        int count = 0;


        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count += 2;


                if (i * i == n) {
                    count -= 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main2025_01_28_2 sol = new Main2025_01_28_2();

        // 테스트 코드
        System.out.println(sol.solution(20));
        System.out.println(sol.solution(100));
    }
}
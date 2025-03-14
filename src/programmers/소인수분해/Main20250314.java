package programmers.소인수분해;

import java.util.ArrayList;
import java.util.List;


/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120852
제한 시간: 30분
사용 시간: 15분
문제해결방법:
소인수 찾기
2부터 n의 제곱근까지 (i * i <= n) i가 n의 인수인지 확인
n이 i로 나누어 떨어지면 리스트에 추가하고, n에서 i를 제거 (n /= i 반복)
마지막 남은 수 추가
n이 1보다 크면 (n > 1), 이것도 소수이므로 리스트에 추가
예를 들어, 17 같은 경우 마지막까지 남아 리스트에 추가됨
*/
public class Main20250314 {
    public static List<Integer> solution(int n) {
        List<Integer> primeFactors = new ArrayList<>();


        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                primeFactors.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        if (n > 1) {
            primeFactors.add(n);
        }

        return primeFactors;
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution(12));  // [2, 3]
        System.out.println(solution(17));  // [17]
        System.out.println(solution(420)); // [2, 3, 5, 7]
    }
}













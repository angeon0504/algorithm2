package programmers.약수구하기;
import java.util.ArrayList;
import java.util.List;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120851
제한 시간: 30분
사용 시간: 16분 초
문제 접근 방식: 1.ArrayList를 사용하여 약수를 저장.
2.for 루프를 이용해 1부터 n까지 반복하며 n % i == 0인 경우 리스트에 추가
3.최종적으로 리스트를 int[] 배열로 변환하여 반환
*/
public class Main20250215 {
        public int[] solution(int n) {
            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                }
            }

            // 리스트를 배열로 변환
            return divisors.stream().mapToInt(i -> i).toArray();
        }

        public static void main(String[] args) {
            Main20250215 solution = new Main20250215();
            int[] result1 = solution.solution(24);
            int[] result2 = solution.solution(29);

            // 테스트 코드
            System.out.println(java.util.Arrays.toString(result1)); // [1, 2, 3, 4, 6, 8, 12, 24]
            System.out.println(java.util.Arrays.toString(result2)); // [1, 29]
        }
    }

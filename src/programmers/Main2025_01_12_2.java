package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120830
제한 시간: 30분
사용 시간: 15분
문제 접근 방식:
- 입력된 좌표 dot의 x와 y 값을 확인하여 조건에 따라 사분면 번호를 반환합니다.
- 문제에서 모든 입력 값이 0이 아니라고 보장하므로 추가적인 예외 처리는 필요하지 않습니다.
*/

public class Main2025_01_12_2 {
    public static class Solution {
        public int solution(int[] dot) {
            int x = dot[0];
            int y = dot[1];

            if (x > 0 && y > 0) {
                return 1; // 제1사분면
            } else if (x < 0 && y > 0) {
                return 2; // 제2사분면
            } else if (x < 0 && y < 0) {
                return 3; // 제3사분면
            } else {
                return 4; // 제4사분면
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트 케이스
        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};
        int[] dot3 = {-5, -8};
        int[] dot4 = {6, -3};

        // 결과 출력
        System.out.println(solution.solution(dot1)); // 출력: 1
        System.out.println(solution.solution(dot2)); // 출력: 2
        System.out.println(solution.solution(dot3)); // 출력: 3
        System.out.println(solution.solution(dot4)); // 출력: 4
    }
}

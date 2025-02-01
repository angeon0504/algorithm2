package programmers.짝수홀수개수;
import java.util.Arrays;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120824
제한 시간: 30분
사용 시간: 16분 13초
문제 접근 방식:for (int num : num_list) : 모든 원소를 순회하면서 짝수와 홀수를 판별한다
 */
class Main20250201 {
    public static int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}))); // [2, 3]
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));    // [0, 4]
    }
}

package programmers;

/*
문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/120847
제한 시간 30분
문제 접근 방식: numbers를  정렬시키고 그중에서 제일 큰 수와 두번째로 큰수를 곱하게 만들어 보자
 */

import java.util.Arrays;

public class Main2024_12_27_2 {
    public static  int solution(int[]numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        return numbers[n - 1] * numbers[n-2];
    }
//테스트 코드
    public static void main(String[] args) {
        int[] t1 = {1,2,3,4,5};
        int[] t2 = {0, 31, 24, 10, 1, 9};


        System.out.println(solution(t1));
        System.out.println(solution(t2));
    }
}

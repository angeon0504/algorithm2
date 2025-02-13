package programmers.최대값만들기2;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120862
제한 시간: 30분
사용 시간: 14분 초
문제 접근 방식:// 가장 큰 두 수의 곱과 가장 작은 두 수의 곱 중 최댓값 반환에서 풀업보자

*/
public class Main20250214 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열 정렬
        int n = numbers.length;


        return Math.max(numbers[0] * numbers[1], numbers[n - 1] * numbers[n - 2]);
    }

    public static void main(String[] args) {
        Main20250214 solution = new Main20250214();
        System.out.println(solution.solution(new int[]{1, 2, -3, 4, -5})); // 15
        System.out.println(solution.solution(new int[]{0, -31, 24, 10, 1, 9})); // 240
        System.out.println(solution.solution(new int[]{10, 20, 30, 5, 5, 20, 5})); // 600
    }
}

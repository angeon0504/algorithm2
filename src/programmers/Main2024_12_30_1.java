package programmers;

import java.util.Arrays;

/*
문제링크:https://school.programmers.co.kr/learn/courses/30/lessons/120833
제한시간 30분
문제접근방식: Arrays.copyOfRange 메서드를 사용하여 배열의 특정 구간을 복사하자
*/
public class Main2024_12_30_1 {
    public static void main(String[] args) {
        Main2024_12_30_1 sol = new Main2024_12_30_1();

        //테스트코드
        int[] result1 = sol.solution(new int[] {1, 2, 3, 4, 5}, 1, 3);
        System.out.println(Arrays.toString(result1)); // 출력: [2, 3, 4]


        int[] result2 = sol.solution(new int[] {1, 3, 5}, 1, 2);
        System.out.println(Arrays.toString(result2)); // 출력: [3, 5]
    }

    // solution 메서드 구현
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}


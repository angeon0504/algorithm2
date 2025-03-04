package programmers.진료순서정하기;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120835
제한 시간: 30분
사용 시간: 21분
문제해결방법:
순위를 저장할 result 배열 생성

배열 크기 n을 저장하고, result 배열을 생성
이중 반복문을 사용하여 응급도 순위 계산

i 번째 요소에 대해 자기보다 큰 값의 개수를 센다
큰 값이 많을수록 순위가 낮아지므로 rank++ 증가
결과 배열에 순위 저장 후 반환
*/
public class Main20250304 {
    public static int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] result = new int[n];

        // 순위를 매기는 과정
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            result[i] = rank;
        }

        return result;
    }
    //테스트 코드
    public static void main(String[] args) {

        int[] emergency1 = {3, 76, 24};
        System.out.println(Arrays.toString(solution(emergency1)));


        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solution(emergency2)));


        int[] emergency3 = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(emergency3)));
    }
}











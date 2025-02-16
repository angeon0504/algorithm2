package programmers.가장큰수찾기;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120899
제한 시간: 30분
사용 시간: 12분 초
문제 접근 방식://Character.isUpperCase(c)를 사용해 대문자인지 확인
Character.toLowerCase(c), Character.toUpperCase(c)를 사용해 변환
*/
public class Main20250216 {
    public static void main(String[] args) {
        int[] array1 = {1, 8, 3};
        int[] array2 = {9, 10, 11, 8};

        System.out.println(Arrays.toString(solution(array1)));
        System.out.println(Arrays.toString(solution(array2)));
    }

    public static int[] solution(int[] array) {
        int maxValue = array[0]; // 최댓값 초기화
        int maxIndex = 0; // 최댓값 인덱스 초기화

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        return new int[]{maxValue, maxIndex};
    }
}



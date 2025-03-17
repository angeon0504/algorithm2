package programmers.공던지기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120843
제한 시간: 30분
사용 시간: 7분
문제해결방법:
 // 한 명을 건너뛰고 던지므로, 인덱스는 2씩 증가하도록 하여 문제를 풀어보자
n
*/
public class Main20250316 {
    public static int solution(int[] numbers, int k) {

        int index = (2 * (k - 1)) % numbers.length;
        return numbers[index];
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }
}













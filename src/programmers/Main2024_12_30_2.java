package programmers;

import java.util.Arrays;

/*
문제링크:https://school.programmers.co.kr/learn/courses/30/lessons/120854
제한시간 30분
문제접근방식 배열의 길이를 재서 리턴하게 만들자
*/

public class Main2024_12_30_2 {

    public int[] solution(String[] strlist) {
        int[] lengths = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            lengths[i] = strlist[i].length();
        }
        return lengths;
    }

    public static void main(String[] args) {
        Main2024_12_30_2 sol = new Main2024_12_30_2();

        // 테스트 케이스 1
        int[] result1 = sol.solution(new String[] {"We", "are", "the", "world!"});
        System.out.println(Arrays.toString(result1)); // 출력: [2, 3, 3, 6]

        // 테스트 케이스 2
        int[] result2 = sol.solution(new String[] {"I", "Love", "Programmers."});
        System.out.println(Arrays.toString(result2)); // 출력: [1, 4, 12]
    }
}



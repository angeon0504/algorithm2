package programmers;

import java.util.Arrays;

/*
문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/120821
제한시간 30분
문제 접근 방식: 코드에 배열의 순서를 뒤집는 for 루프 사용하자
 */
public class Main2024_12_23_2 {
    public int[] main_12_23_2(int[] num_list) {
        int[] reversed = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reversed[i] = num_list[num_list.length - 1 - i];
        }
        return reversed;
}
//테스트 코드
public static void main(String[] args) {
    Main2024_12_23_2 sol = new Main2024_12_23_2();

    int[] result1 = sol.main_12_23_2(new int[]{1, 2, 3, 4, 5});
    int[] result2 = sol.main_12_23_2(new int[]{1, 1, 1, 1, 1, 2});
    int[] result3 = sol.main_12_23_2(new int[]{1, 0, 1, 1, 1, 3, 5});

    System.out.println(Arrays.toString(result1)); // [5, 4, 3, 2, 1]
    System.out.println(Arrays.toString(result2)); // [2, 1, 1, 1, 1, 1]
    System.out.println(Arrays.toString(result3)); // [5, 3, 1, 1, 1, 0, 1]
}
}


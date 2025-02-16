package programmers.문자열정렬하기1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120899
제한 시간: 30분
사용 시간: 12분 초
문제 접근 방식:Character.isDigit(ch)를 사용해 숫자인지 판별

*/
public class Main20250216 {
    public int[] solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch - '0');
            }
        }
        Collections.sort(numbers);

        return numbers.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Main20250216 solution = new Main20250216();

        int[] result1 = solution.solution("hi12392");
        int[] result2 = solution.solution("p2o4i8gj2");
        int[] result3 = solution.solution("abcde0");

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
}



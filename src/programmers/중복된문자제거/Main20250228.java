package programmers.중복된문자제거;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120904
제한 시간: 30분
사용 시간: 15분 초
LinkedHashSet<Character>를 사용하여 문자의 등장 순서를 유지하면서 중복 제거
StringBuilder를 사용하여 결과 문자열을 효율적으로 생성
main 메서드에서 사용자 입력을 받아 solution을 실행하고 결과를 출력

*/
public class Main20250228 {
    public static String solution(String my_string) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    //테스트 코드
    public static void main(String[] args) {

        String input1 = "people";
        String output1 = solution(input1);
        System.out.println("입력: " + input1);
        System.out.println("출력: " + output1);

        String input2 = "We are the world";
        String output2 = solution(input2);
        System.out.println("입력: " + input2);
        System.out.println("출력: " + output2);
    }
}











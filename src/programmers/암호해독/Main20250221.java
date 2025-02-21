package programmers.암호해독;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12092
제한 시간: 30분
사용 시간: 12분 초
문제 접근 방식:! StringBuilder를 사용하여 code의 배수 번째 문자를 모아 최종 문자열을 반환

*/
public class Main20250221 {
    public static String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();
        for (int i = code - 1; i < cipher.length(); i += code) {
            result.append(cipher.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));  // "attack"
        System.out.println(solution("pfqallllabwaoclk", 2));  // "fallback"
    }
}




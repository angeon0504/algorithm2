package programmers.한번만등장하는문자;

import java.util.*;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120890
제한 시간: 30분
사용 시간: 23분
문제해결방법:HashMap을 사용해서 문자개수를 새고 한번만 등장하는 문자를 추출하여 사전순으로 정렬시키고 리스트를 문자열로 반환하여 풀어보자

*/
public class Main20250309 {
    public static String solution(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        List<Character> uniqueChars = new ArrayList<>();
        for (Character c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                uniqueChars.add(c);
            }
        }
        Collections.sort(uniqueChars);

        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcabc"));
        System.out.println(solution("abcd"));
        System.out.println(solution("hello"));
    }
}













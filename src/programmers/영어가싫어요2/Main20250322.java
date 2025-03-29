package programmers.영어가싫어요2;

import java.util.HashMap;
import java.util.Map;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120902
제한 시간: 30분
사용 시간: 7분
문제해결방법:
 HashMap을 사용하여 영어 단어와 숫자를 매핑
replaceAll로 문자열에서 해당 영단어를 숫자로 치환
변환된 문자열을 Long.parseLong()으로 정수로 변환하여 반환
*/
public class Main20250322 {
    public long solution(String numbers) {

        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for (String key : map.keySet()) {
            numbers = numbers.replaceAll(key, map.get(key));
        }

        return Long.parseLong(numbers);
    }

    // 테스트 실행
    public static void main(String[] args) {
        Main20250322 solution = new Main20250322();
        System.out.println(solution.solution("onetwothreefourfivesixseveneightnine")); // 123456789
        System.out.println(solution.solution("onefourzerosixseven")); // 14067
    }
}













package programmers.잘라서배열로저장하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120913
제한 시간: 30분
사용 시간: 15분
문제해결방법:
결과를 저장할 리스트
문자열을 n 크기씩 잘라서 리스트에 추가
리스트를 배열로 변환하여 반환
n
*/
public class Main20250316 {
    public static String[] solution(String my_str, int n) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            result.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }


        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6))); // ["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(solution("abcdef123", 3)));        // ["abc", "def", "123"]
    }
}













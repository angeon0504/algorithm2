package programmers.대문자와소문자;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120862
제한 시간: 30분
사용 시간: 12분 초
문제 접근 방식:solution 메서드는 배열에서 최댓값과 해당 인덱스를 찾기
*/
public class Main20250214 {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c)); // 대문자 → 소문자 변환
            } else {
                result.append(Character.toUpperCase(c)); // 소문자 → 대문자 변환
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Main20250214 solution = new Main20250214();
        System.out.println(solution.solution("cccCCC")); // "CCCccc"
        System.out.println(solution.solution("abCdEfghIJ")); // "ABcDeFGHij"
    }
}


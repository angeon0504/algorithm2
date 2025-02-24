package programmers.외계행성의나이;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120851
제한 시간: 30분
사용 시간: 12분 초
문제 접근 방식: age를 문자열로 변환해서 풀어보자
*/
public class Main20250224 {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        String ageStr = String.valueOf(age);

        for (char digit : ageStr.toCharArray()) {
            result.append((char) ('a' + (digit - '0'))); // 숫자를 대응하는 문자로 변환
        }

        return result.toString();
    }
    //테스트 코드
    public static void main(String[] args) {
        Main20250224 solution = new Main20250224();
        System.out.println(solution.solution(23));
        System.out.println(solution.solution(51));
        System.out.println(solution.solution(100));
    }
}

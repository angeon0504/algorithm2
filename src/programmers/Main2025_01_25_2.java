package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120908
제한 시간: 30분
사용 시간: 5분
문제 접근 방식:
-str1.contains(str2):
문자열 str1에 str2가 포함되어 있는지 확인하는 메서드으로 풀자
*/

public class Main2025_01_25_2 {
    public int solution(String str1, String str2) {
        // str1에 str2가 포함되어 있는지 확인
        return str1.contains(str2) ? 1 : 2;
    }


    public static void main(String[] args) {
        Main2025_01_25_2 sol = new Main2025_01_25_2();

        // 예제 테스트
        System.out.println(sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD")); // 1
        System.out.println(sol.solution("ppprrrogrammers", "pppp")); // 2
        System.out.println(sol.solution("AbcAbcA", "AAA")); // 2
    }
}
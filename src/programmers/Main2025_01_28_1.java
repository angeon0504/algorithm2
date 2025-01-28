package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120826
제한 시간: 30분
사용 시간: 12분 18초
문제 접근 방식:String.replace() 메서드를 사용하여 letter 값을 빈 문자열 ""로 대체해 풀기
*/

public class Main2025_01_28_1 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        Main2025_01_28_1 sol = new Main2025_01_28_1();

        // 테스트 코드
        System.out.println(sol.solution("abcdef", "f"));
        System.out.println(sol.solution("BCBdbe", "B"));
    }
}
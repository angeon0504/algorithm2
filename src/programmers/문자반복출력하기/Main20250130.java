package programmers.문자반복출력하기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120825
제한 시간: 30분
사용 시간: 15분 27초
문제 접근 방식:toCharArray()를 통해 문자열의 각 문자를 순회하면서 문자를 n번 반복하여 풀어보기

*/
public class Main20250130 {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }

    // 테스트 코드
    public static void main(String[] args) {
        Main20250130 solution = new Main20250130();
        String my_string = "hello";
        int n = 3;
        String result = solution.solution(my_string, n);
        System.out.println(result);
    }
}


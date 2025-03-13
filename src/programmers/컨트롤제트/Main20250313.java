package programmers.컨트롤제트;

import java.util.Stack;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120890
제한 시간: 30분
사용 시간: 8분
문제해결방법:
공백 기준으로 문자열 분리
마지막으로 더한 숫자 제거,
숫자라면 스택에 추가,
스택에 남은 숫자 합산
*/
public class Main20250313 {
    public int solution(String s) {
        String[] tokens = s.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Main20250313 solution = new Main20250313();
        System.out.println(solution.solution("1 2 Z 3"));
        System.out.println(solution.solution("10 20 30 40"));
        System.out.println(solution.solution("10 Z 20 Z 1"));
        System.out.println(solution.solution("10 Z 20 Z"));
        System.out.println(solution.solution("-1 -2 -3 Z"));
    }
}













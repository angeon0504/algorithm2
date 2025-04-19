package programmers.ox퀴즈;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1209087
제한 시간: 30분
사용 시간: 25분
문제해결방법:
문자열 "X [연산자] Y = Z"는 공백 " "으로 나누면 [X, 연산자, Y, =, Z] 5개의 토큰이 된다
Integer.parseInt()로 숫자와 음수를 안전하게 파싱시키고
실제 계산 결과와 주어진 Z 값을 비교하여 "O" 또는 "X"를 results 배열에 저장시키기.

환

*/
public class Main20250419 {
    public String[] solution(String[] quiz) {
        String[] results = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] tokens = quiz[i].split(" ");

            int leftOperand = Integer.parseInt(tokens[0]);
            String operator = tokens[1];
            int rightOperand = Integer.parseInt(tokens[2]);
            int expectedResult = Integer.parseInt(tokens[4]);

            int actualResult = operator.equals("+")
                    ? leftOperand + rightOperand
                    : leftOperand - rightOperand;

            results[i] = (actualResult == expectedResult) ? "O" : "X";
        }

        return results;
    }

    // 테스트용 메인 함수
    public static void main(String[] args) {
        Main20250419 soltion = new Main20250419();

        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(soltion.solution(quiz1)));

        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(soltion.solution(quiz2)));
    }
}













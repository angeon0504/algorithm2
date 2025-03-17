package programmers.영어가싫어요;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120902
제한 시간: 30분
사용 시간: 7분
문제해결방법:
 공백을 기준으로 분리
첫 번째 숫자로 초기화
연산자와 숫자를 순서대로 처리
*/
public class Main20250317 {
    public static int solution(String my_string) {
        String[] tokens = my_string.split(" "); //
        int result = Integer.parseInt(tokens[0]); //

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int num = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                result += num;
            } else if (operator.equals("-")) {
                result -= num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution("3 + 4"));
        System.out.println(solution("10 - 2 + 5"));
        System.out.println(solution("100 - 50 - 25"));
    }
}













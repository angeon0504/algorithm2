package programmers.숨어있는숫자의덧셈1;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120851
제한 시간: 30분
사용 시간: 16분 초
문제 접근 방식: Character.isDigit(ch): 문자가 숫자인지 확인하는 메서드를 사용해서 풀어보자

*/
public class Main20250209 {
    public static int solution(String my_string) {
        int sum = 0;

        for (char ch : my_string.toCharArray()) {
            // 숫자인 경우 누적합 계산
            if (Character.isDigit(ch)) {
                sum += ch - '0';  // 문자 '0'을 빼서 실제 숫자로 변환
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // 테스트 코드
        System.out.println(solution("aAb1B2cC34oOp"));  // 10
        System.out.println(solution("1a2b3c4d123Z"));   // 16
    }
}

package programmers.팩토리얼;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120848
제한 시간: 30분
사용 시간: 5분
문제해결방법:
1.변수 초기화
i = 1: 팩토리얼을 계산할 변수
factorial = 1: 초기 팩토리얼 값 (1!)
2.반복문 실행 (while)
factorial * (i + 1) ≤ n 조건을 만족하는 동안 i 증가
factorial *= i;을 통해 현재 i! 값을 계산
3.최대 i 반환
factorial이 n을 초과하지 않는 가장 큰 i를 반환

*/
public class Main20250307 {
    public static int solution(int n) {
        int i = 1;
        int factorial = 1;

        while (factorial * (i + 1) <= n) {
            i++;
            factorial *= i;
        }

        return i;
    }
    //테스트 코드
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }
}












package programmers.종이자르기;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120869
제한 시간: 30분
사용 시간: 7분
문제해결방법:
 최소 가위질 횟수=M×N−1

*/
public class Main20250329 {
    public static int solution(int M, int N) {
        // 최소 가위질 횟수 = M * N - 1
        return (M * N) - 1;
    }
    // 테스트 코드
    public static void main(String[] args) {
        System.out.println(solution(2, 2));
        System.out.println(solution(2, 5));
        System.out.println(solution(1, 1));
    }
}














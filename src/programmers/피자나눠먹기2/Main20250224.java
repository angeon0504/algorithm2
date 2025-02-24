package programmers.피자나눠먹기2;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120851
제한 시간: 30분
사용 시간: 12분 초
문제 접근 방식: 1 // 최대공약수(GCD) 구하는 메서드 (유클리드 호제법)과 최소공배수(LCM) 구하는 메서드를 사용해서 풀어보자
*/
public class Main20250224 {
    public int solution(int n) {
        return lcm(n, 6) / 6;
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //테스트 코드
    public static void main(String[] args) {
        Main20250224 solution = new Main20250224();
        System.out.println(solution.solution(6));  // 1
        System.out.println(solution.solution(10)); // 5
        System.out.println(solution.solution(4));  // 2
    }
}

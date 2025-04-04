package programmers.치킨쿠폰;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120883
제한 시간: 30분
사용 시간: 10분
문제해결방법:
치킨을 먹을 때마다 쿠폰 1장 발급
쿠폰이 10장 모이면 서비스 치킨 1마리 받음 → 다시 쿠폰 1장 발급됨
이 과정을 쿠폰이 10장 이상일 때까지 반복

*/
public class Main20250404 {
    public int solution(int chicken) {
        int coupon = chicken;
        int service = 0;

        while (coupon >= 10) {
            int free = coupon / 10;
            service += free;
            coupon = coupon % 10 + free;
        }

        return service;
    }

    public static void main(String[] args) {
        Main20250404 solution = new Main20250404();
        System.out.println(solution.solution(100));
        System.out.println(solution.solution(1081));
    }
}














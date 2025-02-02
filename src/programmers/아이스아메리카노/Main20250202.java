package programmers.아이스아메리카노;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120819
제한 시간: 30분
사용 시간: 6분 초
문제 접근 방식:

*/
public class Main20250202 {
    public int[] solution(int money) {
        int price = 5500;
        int cups = money / price;
        int change = money % price;
        return new int[]{cups, change};
    }

    public static void main(String[] args) {
        Main20250202 solution = new Main20250202();
        int[] result1 = solution.solution(5500);
        int[] result2 = solution.solution(15000);

        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
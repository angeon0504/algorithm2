package programmers.주사위의개수;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12092
제한 시간: 30분
사용 시간: 5분 초
문제 접근 방식:!for문 사용

*/
public class Main20250221 {
    public static int maxDiceCount(int[] box, int n) {
        int count = 1;
        for (int length : box) {
            count *= length / n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxDiceCount(new int[]{1, 1, 1}, 1));  // 1
        System.out.println(maxDiceCount(new int[]{10, 8, 6}, 3));  // 12
    }
}





package programmers.게임369;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120844
제한 시간: 30분
사용 시간: 11분 초
문제 접근 방식: for문을 사용하여 풀어보자
*/
public class Main20250226 {
    public static int solution(int order) {
        String strOrder = String.valueOf(order);
        int clapCount = 0;

        for (char ch : strOrder.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }

    public static void main(String[] args) {
        System.out.println(solution(3)); // 1
        System.out.println(solution(29423)); // 2
    }
}



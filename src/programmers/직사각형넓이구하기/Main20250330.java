package programmers.직사각형넓이구하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120869
제한 시간: 30분
사용 시간: 7분
문제해결방법:
 주어진 점들의 x 좌표와 y 좌표에서 최댓값과 최솟값을 찾아 직사각형의 가로(width)와 세로(height)를 계산한 후, 이를 곱하여 넓이를 반환하여 풀어보자

*/
public class Main20250330 {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
    //테스트 코드
    public static void main(String[] args) {
        Main20250330 solution = new Main20250330();
        System.out.println(solution.solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})); // 1
        System.out.println(solution.solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})); // 4
    }
}















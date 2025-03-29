package programmers.캐릭터의좌표;

import java.util.HashMap;
import java.util.Map;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120861
제한 시간: 30분
사용 시간: 27분
문제해결방법:
 x, y 좌표는 (0, 0)에서 시작
보드의 한계를 반으로 나눈 몫을 최대 이동 거리로 설정
switch 문으로 키 입력 방향을 탐색
*/
public class Main20250322 {
    public int[] solution(String[] keyinput, int[] board) {

        int x = 0;
        int y = 0;


        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;


        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y < yLimit) y += 1;
                    break;
                case "down":
                    if (y > -yLimit) y -= 1;
                    break;
                case "left":
                    if (x > -xLimit) x -= 1;
                    break;
                case "right":
                    if (x < xLimit) x += 1;
                    break;
            }
        }
        return new int[]{x, y};
    }

    // 테스트 코드
    public static void main(String[] args) {
        Main20250322 solution = new Main20250322();
        System.out.println(java.util.Arrays.toString(solution.solution(
                new String[]{"left", "right", "up", "right", "right"},
                new int[]{11, 11})));

        System.out.println(java.util.Arrays.toString(solution.solution(
                new String[]{"down", "down", "down", "down", "down"},
                new int[]{7, 9})));
    }
}













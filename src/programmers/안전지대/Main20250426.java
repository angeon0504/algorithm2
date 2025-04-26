package programmers.안전지대;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120866
제한 시간: 30분
사용 시간: 30분
문제해결방법:
Cell이 자신이 위험한지 아닌지 알고 있음
Board는 지도의 전체 상태를 보관
MineDetector는 로직만 담당하고 상태는 다루지 않음 (단일 책임)
SafeZoneCounter는 계산만 담당
*/

public class Main20250426 {
    public static int solution(int[][] boardData) {
        Board board = new Board(boardData);
        MineDetector detector = new MineDetector();
        detector.markDangerZones(board);

        SafeZoneCounter counter = new SafeZoneCounter();
        return counter.count(board);
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(solution(board));
    }
}

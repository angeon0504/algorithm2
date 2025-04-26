package programmers.안전지대;

// MineDetector.java
public class MineDetector {
    private final static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private final static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public void markDangerZones(Board board) {
        int n = board.getSize();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                Cell cell = board.getCell(x, y);
                if (cell.hasMine()) {
                    for (int d = 0; d < 8; d++) {
                        int nx = x + dx[d];
                        int ny = y + dy[d];
                        if (board.isInBounds(nx, ny)) {
                            board.getCell(nx, ny).markDangerous();
                        }
                    }
                }
            }
        }
    }
}

package programmers.안전지대;

// SafeZoneCounter.java
public class SafeZoneCounter {
    public int count(Board board) {
        int count = 0;
        int n = board.getSize();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!board.getCell(i, j).isDangerous()) {
                    count++;
                }
            }
        }

        return count;
    }
}

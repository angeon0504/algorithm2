package programmers.안전지대;


    public class Board {
    private final int size;
    private final Cell[][] cells;

    public Board(int[][] boardData) {
        this.size = boardData.length;
        this.cells = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(boardData[i][j] == 1);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public boolean isInBounds(int x, int y) {
        return 0 <= x && x < size && 0 <= y && y < size;
    }
}

package programmers.겹치는선분의길이;

public class OverlapCalculator implements  ICalculator{
    private final int OFFST = 100;
    private final int[] points = new int[201];

    @Override
    public void addLine(ILine line) {
        for (int i = line.getStart(); i < line.getEnd(); i++) {
            points[i + OFFST]++;
        }
    }

    @Override
    public int calculateOverlapLength() {
        int count = 0;
        for (int point : points) {
            if (point >=2){
                count++;
            }
        }
        return count;
    }
}

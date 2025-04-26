package programmers.겹치는선분의길이;

public class Line implements ILine{
    private final int start;
    private final int end;

    public Line(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public int getStart() {
        return start;
    }

    @Override
    public int getEnd() {
        return end;
    }
}

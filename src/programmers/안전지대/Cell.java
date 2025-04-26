package programmers.안전지대;

public class Cell {
    private  boolean hasMine;
    private  boolean isDangerous;

    public Cell(boolean hasMine) {
        this.hasMine = hasMine;
        this.isDangerous =  hasMine;
    }

    public boolean hasMine() {
        return  hasMine;
    }

    public boolean isHasMine() {
        return hasMine;
    }

    public boolean isDangerous() {
        return isDangerous;
    }
    public void markDangerous(){
        this.isDangerous =  true;
    }
}


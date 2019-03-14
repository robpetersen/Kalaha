package KalahaGame;

public class Pit {
    private int belongsTo;
    private boolean isKalaha;
    private int stones;

    public Pit(int belongsTo, boolean isKalaha, int stones){
        this.belongsTo = belongsTo;
        this.isKalaha = isKalaha;
        this.stones = stones;
    }

    public int getSeeds() {
        return stones;
    }

    public void setSeeds(int stones) {
        this.stones = stones;
    }
}

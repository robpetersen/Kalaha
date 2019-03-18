package KalahaGame;

public class Pit {
    private int belongsTo;
    private boolean isKalaha;
    private int stones;

    private int position;



    public Pit(int belongsTo, boolean isKalaha, int stones, int position){
        this.belongsTo = belongsTo;
        this.isKalaha = isKalaha;
        this.stones = stones;
        this.position = position;
    }

    public int getStones() {
        return stones;
    }

    public void setStones(int stones) {
        this.stones = stones;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString(){
        return "Player: " + belongsTo + ", isKalaha: " + isKalaha + ", Stones: " + stones + ", Position: " + position;
    }

}

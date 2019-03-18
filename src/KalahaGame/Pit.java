package KalahaGame;

import javafx.scene.control.Button;

public class Pit {

    private int belongsTo;
    private boolean isKalaha;
    private int stones;
    private Button button = null;

    public Pit(int belongsTo, boolean isKalaha, int stones, Button button){
        this.belongsTo = belongsTo;
        this.isKalaha = isKalaha;
        this.stones = stones;
        this.button = button;
    }

    public int getStones() {
        return stones;
    }

    public void setStones(int stones) {
        this.stones = stones;
    }

    public int getBelongsTo() {
        return belongsTo;
    }

    public boolean isKalaha() {
        return isKalaha;
    }

    public Button getButton() {
        return button;
    }
}

package KalahaGame;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.ListIterator;

public class Kalaha extends Application {

    private LinkedList<Pit> boardList = new LinkedList<>();


    @Override
    public void start(Stage primaryStage) {
        fillBoard();

    }

    public void fillBoard(){
        for (int i = 1; i <= 14; i++) {
            if(i <= 6){ //first six elements belonging to player1
                boardList.add(new Pit(1,false,6));
            }
            else if(i == 7){ //seventh element/player 1's kalaha
                boardList.add(new Pit(1,true,0));
            }
            else if(i <= 13){ //next 6 elements belonging to player 2
                boardList.add(new Pit(2,false,6));
            }
            else{ // fourteenth element/player 2's kalaha
                boardList.add(new Pit(2,true,0));
            }
        }
    }
}

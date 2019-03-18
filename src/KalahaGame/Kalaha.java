package KalahaGame;

import javafx.application.Application;
import javafx.stage.Stage;

public class Kalaha extends Application {

    private CircularLinkedList boardList = new CircularLinkedList();
    //private ListIterator<Pit> boardIterator = boardList.listIterator();

    @Override
    public void start(Stage primaryStage) {
        System.out.println(boardList.getData(boardList.get(0)));
        System.out.println(boardList.getNextData(boardList.get(0)));
        System.out.println();

        System.out.println(boardList.getData(boardList.get(13)));
        System.out.println(boardList.getNextData(boardList.get(13)));
    }


}

package KalahaGame;

import javafx.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Kalaha extends Application {

    private CircularLinkedList boardList = new CircularLinkedList();
    private int[] xLayout = {350,300,250,200,150,100,50,100,150,200,250,300,350,400};
    private int[] yLayout = {50,50,50,50,50,50,100,150,150,150,150,150,150,100};
    private int currentTurn = 1;
    private Label turnLabel = new Label("Player " + currentTurn + "'s turn!");

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane(); //creating the pane
        Scene scene = new Scene(root, 500, 500); //adding the pane to the scene

        turnLabel.setLayoutX(125);
        turnLabel.setLayoutY(250);
        turnLabel.setFont(new Font(40));
        root.getChildren().add(turnLabel);

        //getting all buttons from list and adding them to Pane
        for (int i = 0; i < boardList.length(); i++) {
            final int index = i;
            Button temp = boardList.get(i).getData().getButton();
            temp.setLayoutX(xLayout[i]);
            temp.setLayoutY(yLayout[i]);
            temp.setFont(new Font(25));
            updateButtons(); //setting text on all buttons
            temp.setOnMouseClicked( new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    //only move if this button belongs to player currentTurn, and stones > 0
                    if(boardList.get(index).getData().getBelongsTo() == currentTurn &&
                            boardList.getData(boardList.get(index)).getStones() > 0){
                        move(index);
                        updateButtons();
                        switchTurn();
                    }
                }
            } );
            root.getChildren().add(temp);
        }

        primaryStage.setTitle("Kalaha"); //set title of stage
        primaryStage.setScene(scene); //adding the scene to the stage
        primaryStage.show(); //showing the stage
    }

    //set text on all Buttons
    private void updateButtons(){
        for (int i = 0; i < boardList.length(); i++) {
            Button temp = boardList.get(i).getData().getButton();
            temp.setText("" + boardList.get(i).getStones());
        }
    }

    private void switchTurn(){
        if(currentTurn == 1){
            currentTurn = 2;
        }
        else{
            currentTurn = 1;
        }
        turnLabel.setText("Player " + currentTurn + "'s turn!");
    }

    //Move the stones of this index
    private void move(int index){
        //holding the stones of this Pit in hand
        int hand = boardList.getData(boardList.get(index)).getStones();
        //setting this Pit to zero stones
        boardList.getData(boardList.get(index)).setStones(0);

        CircularLinkedList.ListNode current = boardList.get(index);
        //while there are stones in the hand
        while(hand > 0){
            //place stones unless this element is a kalaha and it belongs to the other player
            if(current.getNext().getData().isKalaha() &&
                    current.getNext().getData().getBelongsTo() != currentTurn){
                current = current.getNext();
            }
            else{
                //setting next to getStones + 1
                current.getNext().setStones(current.getNext().getStones()+1);
                //moving on to next node
                current = current.getNext();
                //decrementing hand
                hand--;
            }
        }
    }
}

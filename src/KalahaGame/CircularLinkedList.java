package KalahaGame;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class CircularLinkedList {
    private List<ListNode> list = new ArrayList<>();

    public CircularLinkedList(){
        setup();
        createCircularLinkedList();
    }

    public class ListNode{
        private ListNode next;
        private Pit data;

        public ListNode(Pit data){
            this.data = data;
        }

        public ListNode getNext() {
            return next;
        }

        public Pit getData() {
            return data;
        }

        public int getStones(){
            return data.getStones();
        }

        public void setStones(int newStoneCount){
            data.setStones(newStoneCount);
        }
    }

    public Pit getData(ListNode current){
        return current.getData();
    }

    //get a ListNode by index
    public ListNode get(int index){
        return list.get(index);
    }

    public int length(){
        return list.size();
    }

    private ListNode first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth,thirteenth,fourteenth;

    //Instantiating the nodes needed for Kalaha
    private void setup(){
        list.add(first = new ListNode(new Pit(1,false,6,new Button("bullshit"))));
        list.add(second = new ListNode(new Pit(1,false,6,new Button("a"))));
        list.add(third = new ListNode(new Pit(1,false,6,new Button("b"))));
        list.add(fourth = new ListNode(new Pit(1,false,6,new Button("c"))));
        list.add(fifth = new ListNode(new Pit(1,false,6,new Button("d"))));
        list.add(sixth = new ListNode(new Pit(1,false,6, new Button("e"))));
        list.add(seventh = new ListNode(new Pit(1,true,0,new Button("f"))));
        list.add(eighth = new ListNode(new Pit(2,false,6,new Button("g"))));
        list.add(ninth = new ListNode(new Pit(2,false,6,new Button("h"))));
        list.add(tenth = new ListNode(new Pit(2,false,6,new Button("i"))));
        list.add(eleventh = new ListNode(new Pit(2,false,6,new Button("j"))));
        list.add(twelfth = new ListNode(new Pit(2,false,6,new Button("k"))));
        list.add(thirteenth = new ListNode(new Pit(2,false,6,new Button("l"))));
        list.add(fourteenth = new ListNode(new Pit(2,true,0,new Button("m"))));
    }

    //setting references to next node
    private void createCircularLinkedList(){
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;
        ninth.next = tenth;
        tenth.next = eleventh;
        eleventh.next = twelfth;
        twelfth.next = thirteenth;
        thirteenth.next = fourteenth;
        fourteenth.next = first;
    }
}

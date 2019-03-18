package KalahaGame;

import java.util.ArrayList;
import java.util.List;

public class CircularLinkedList {
    private List<ListNode> list = new ArrayList<>();

    public CircularLinkedList(){
        setup();
        createCircularLinkedList();
    }

    private class ListNode{
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
    }


    //takes in a Pit and returns data from the Pit in the next ListNode in the List
    public Pit getNextData(ListNode current){
        ListNode next = current.getNext();
        return next.getData();
    }

    public Pit getData(ListNode current){
        return current.getData();
    }

    //get a ListNode by index
    public ListNode get(int index){
        return list.get(index);
    }

    private ListNode first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth,thirteenth,fourteenth;

    //Instantiating the nodes needed for Kalaha
    private void setup(){
        list.add(first = new ListNode(new Pit(1,false,6,1)));
        list.add(second = new ListNode(new Pit(1,false,6,2)));
        list.add(third = new ListNode(new Pit(1,false,6,3)));
        list.add(fourth = new ListNode(new Pit(1,false,6,4)));
        list.add(fifth = new ListNode(new Pit(1,false,6,5)));
        list.add(sixth = new ListNode(new Pit(1,false,6,6)));
        list.add(seventh = new ListNode(new Pit(1,true,0,7)));
        list.add(eighth = new ListNode(new Pit(2,false,6,8)));
        list.add(ninth = new ListNode(new Pit(2,false,6,9)));
        list.add(tenth = new ListNode(new Pit(2,false,6,10)));
        list.add(eleventh = new ListNode(new Pit(2,false,6,11)));
        list.add(twelfth = new ListNode(new Pit(2,false,6,12)));
        list.add(thirteenth = new ListNode(new Pit(2,false,6,13)));
        list.add(fourteenth = new ListNode(new Pit(2,false,6,14)));
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

package dataStructure;
import java.util.*;
public class LinkedListStructure {
    public static void main(String args[]){


        //declairation, instantiation
        LinkedList<Integer> linkedlist=new LinkedList<>();

        //initialization
        linkedlist.add(12);
        linkedlist.add(31);
        linkedlist.add(73);
        linkedlist.add(53);
        linkedlist.add(70);


        System.out.println(linkedlist);
        linkedlist.remove(2);
        System.out.println(linkedlist);
    }
}

package dataStructure;
import java.util.*;
public class QueueStructure {

    public static void main(String args[]){

        Queue<Integer> queue=new LinkedList<>();

        queue.add(12);
        queue.add(43);
        queue.add(73);
        queue.add(41);
        queue.add(98);
        queue.add(67);

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        queue.poll();
        queue.poll();
        System.out.println(queue);

    }
}

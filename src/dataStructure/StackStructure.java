package dataStructure;
import java.util.*;
public class StackStructure {

    public static void main(String args[]){

        Stack<Integer> stack=new Stack<>();

        stack.push(1);
        stack.push(22);
        stack.push(13);
        stack.push(43);
        stack.push(28);
        stack.push(51);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}

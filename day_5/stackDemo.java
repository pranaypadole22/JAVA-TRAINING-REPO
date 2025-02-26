package day_5;
//Stack
//It works on LIFO it is legacy
import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> sInt=new Stack<Integer>();
        sInt.push(23);
        sInt.push(30);
        sInt.push(83);
        sInt.push(29);
        sInt.push(53);
        System.out.println("Popped value is:"+sInt.pop());
        System.out.println("current stack top:"+sInt.peek());

    }
}

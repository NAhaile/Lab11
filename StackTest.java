import java.util.*;

public class StackTest {
 public static void main(String[] args) {
 ArrayDeque<String> stack = new ArrayDeque<String>();
 
 stack.push("TimmyTurner");
 stack.push("Wanda");
 stack.push("Cosmo");
 
 System.out.println(stack.peekLast());
 System.out.println(stack.peekFirst());
 
 stack.removeLast();
 
 System.out.println(stack.size()+ "\n");
 
 ArrayDeque<String> queue = new ArrayDeque<String>();
 
 queue.offer("Papa");
 queue.offer("Mama");
 queue.offer("Sisteh");
 
 
 System.out.println(queue.peekFirst());
 System.out.println(queue.peekLast());
 
 queue.poll();
 
 
 
 
 
 
 

}
}
